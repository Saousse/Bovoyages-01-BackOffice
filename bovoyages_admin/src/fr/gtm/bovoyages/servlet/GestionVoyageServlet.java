package fr.gtm.bovoyages.servlet;

import java.io.IOException;

//import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.bovoyages.entities.Voyage;
import fr.gtm.bovoyages.entities.Voyageur;

import fr.gtm.bovoyages.service.VoyageService;


@WebServlet("/GestionVoyage")
public class GestionVoyageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private static final Logger LOG = Logger.getLogger(VoyageDAO.class.getName());  
  
	 @EJB private VoyageService service;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		Voyage voyage = new Voyage();
		
		String civilite = request.getParameter("civilite");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
//		if(civilite != null &&  nom != null && prenom != null ) {}
		
		Voyageur voyageur = new Voyageur();
		voyageur.setCivilite(civilite);
		voyageur.setNom(nom);
		voyageur.setPrenom(prenom);
		
		service.saveOrUpdate(voyage);	
	}

}
