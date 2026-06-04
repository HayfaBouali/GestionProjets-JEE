package tn.essat.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import java.util.ArrayList;

import tn.essat.model.Departement;

import tn.essat.model.Projet;

public class GestionImp implements IGestion {
	Connection cnx;

	public GestionImp() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/basetd2", "root", "");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Departement> getAllDepartements() {
		List<Departement> depts = new ArrayList<>();
		try {
			PreparedStatement pre = cnx.prepareStatement("select * from departements");
			ResultSet rs = pre.executeQuery();
			while (rs.next()) {
				Departement dept = new Departement(rs.getInt("id"), rs.getString("titre"));
				depts.add(dept);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return depts;

	}

	@Override
	public List<Projet> getAllProjetsByDept(int id) {
		List<Projet> liste = new ArrayList<>();
		try {
			PreparedStatement pre = cnx.prepareStatement("select * from projet where id_dept=?");
			pre.setInt(1, id);
			ResultSet rs = pre.executeQuery();
			while (rs.next()) {
				Projet p = new Projet(rs.getInt("id"), rs.getString("titre"), getDeptById(rs.getInt("id_dept")));
				liste.add(p);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return liste;
	}

	@Override
	public Departement getDeptById(int id) {
		Departement dept = null;
		try {
			PreparedStatement pre = cnx.prepareStatement("select * from Departement where id=?");
			pre.setInt(1, id);// 1 cad position de id dans le tableau
			ResultSet rs = pre.executeQuery();
			if (rs.next()) {
				dept = new Departement(rs.getInt("id"), rs.getString("titre"));
			}
		}

		catch (Exception e) {
			// TODO: handle exception
		}

		// TODO Auto-generated method stub
		return dept;
	}

	@Override
	public void addProjet(Projet p) {
		try {
			PreparedStatement pre = cnx.prepareStatement("insert into projet values(null,?,?)");
			pre.setString(1, p.getTitre());
			pre.setInt(2, p.getDept().getId());

			pre.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub

	}

}
