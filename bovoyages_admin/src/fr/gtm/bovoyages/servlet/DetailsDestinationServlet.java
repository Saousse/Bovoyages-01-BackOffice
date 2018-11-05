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
import fr.gtm.bovoyages.dao.DestinationDAO;
import fr.gtm.bovoyages.service.DestinationService;

/**
 * Servlet implementation class DestinationById
 * 
 * Assure le lien entre la pr�sentation ( fichiers de type jsp) et  la persistance (vers m�thode du DAO qui utilise SQL)
 * R�cup�re de la base de donn�es  une destination identifi� par id
 * et la 
 */
@WebServlet("/DetailsDestinationServlet")
public class DetailsDestinationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOG = Logger.getLogger(DestinationDAO.class.getName());
	
	@EJB private DestinationService service;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idStr = request.getParameter("id");
		
		LOG.info(">>>>>> getParametre id " + idStr);
		
		List<DatesVoyage> datesvoyages = service.getDatesVoyageById(Integer.valueOf(idStr));
		
		List<Destination> destinations = service.getAllDestinations();
		for( Destination d: destinations ) {
			if( d.getId() == Integer.valueOf(idStr)) {
				request.setAttribute("destination",d);	
			}
		}
		
		request.setAttribute("datesvoyages",datesvoyages);
		LOG.info(">>>>>> request datesvoyages " + datesvoyages);
		String page = "/details.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
