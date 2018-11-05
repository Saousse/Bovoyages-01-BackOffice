package fr.gtm.bovoyages.servlet;

import java.io.IOException;

import java.util.List;
import java.util.logging.Logger;


import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import fr.gtm.bovoyages.entities.DatesVoyage;
import fr.gtm.bovoyages.entities.Destination;
import fr.gtm.bovoyages.entities.Voyage;
import fr.gtm.bovoyages.dao.DestinationDAO;
import fr.gtm.bovoyages.service.DestinationService;

/**
 * Servlet implementation class CommandeServlet
 * Est li� � la page jsp commandeform.jsp;
 * G�re le choix du nombre des voyageurs pour une destination et une date choisie et calcule le prix total 
 * 
 * Pour l'instant pas de bouton de reservation...
 * 
 */
@WebServlet("/CommandeServlet")
public class CommandeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(DestinationDAO.class.getName());
	 @EJB private DestinationService service;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // r�cup�re les param�tres identifants destination et dates, et, � l'aide de requ�ts, remplit une variable de type voyage.
		 int nbPers =1;
		 String idDest = request.getParameter("idDest");
		 String idDepart = request.getParameter("idDepart");
		 int idD = Integer.valueOf(idDest);
		 int idA= Integer.valueOf(idDepart);
		 
		 String nbPersonne= request.getParameter("nbVoyageurs");
		 LOG.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> nbVoyageurs:" + nbPersonne );
		 
		 
		 if (nbPersonne != null) {
			 nbPers = Integer.valueOf(nbPersonne);
		 }
		 
         Voyage voyage= new Voyage();
        
		  LOG.info(">>>>>> getParametre idDest et idDepart dans CommandeServlet");
		  
		  List<Destination> destinations =service.getAllDestinations();
			for( Destination d: destinations ) {
				
				if( d.getId() == idD) {
					
					request.setAttribute("dest",idD);
					
					voyage.setDescriptif(d.getDescription());
					voyage.setRegion(d.getRegion());
					
				}
				
				LOG.info(">>>>>>  destination en CommandeServlet set");
			}
			 
			List<DatesVoyage> dates = service.getDatesVoyageById(idD);
				for( DatesVoyage d: dates ) {
					if( d.getId() == idA) {
						request.setAttribute("datevo",idA);
						voyage.setDatesVoyage(d);
					}
					LOG.info(">>>>>>  date en CommandeServlet set" + d);
				}
				
				request.setAttribute("voyage",voyage);	
		 LOG.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  calcul Prix Total");	
			double prixHT = nbPers * voyage.getPrixHT();
			 LOG.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  calcul Prix Total fait"+ prixHT);		
			   request.setAttribute("prixHT",prixHT);	
				String page = "/commandeform.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
			rd.forward(request, response);
		  //sortir une page  formulaire pour commander
		  
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
