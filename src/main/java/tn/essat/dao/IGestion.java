package tn.essat.dao;

import java.util.List;

import tn.essat.model.Departement;
import tn.essat.model.Projet;


public interface IGestion {
	public List<Departement> getAllDepartements();
	
	public List<Projet> getAllProjetsByDept(int id);
	public Departement getDeptById(int id);
	public void addProjet(Projet p);
	

}
