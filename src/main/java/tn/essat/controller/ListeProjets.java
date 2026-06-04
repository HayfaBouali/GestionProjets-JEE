package tn.essat.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionImp;
import tn.essat.dao.IGestion;
import tn.essat.model.Departement;
import java.util.List;
import tn.essat.model.Projet;

/**
 * Servlet implementation class ListeProjets
 */
@WebServlet("/ListeProjets")
public class ListeProjets extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListeProjets() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		IGestion dao=new GestionImp();
		List<Projet> liste=dao.getAllProjetsByDept(id);
		Departement dept=dao.getDeptById(id);
		request.setAttribute("liste",liste);
		request.setAttribute("dept",dept);
		request.getRequestDispatcher("projets.jsp").forward(request,response);

		
	}
	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
