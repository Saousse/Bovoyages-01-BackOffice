package fr.gtm.bovoyages.servlet;

import java.io.IOException;
import java.util.List;


import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import fr.gtm.bovoyages.entities.Destination;
import fr.gtm.bovoyages.service.DestinationService;


/**
 * Servlet implementation class ListeDestination
 */
@WebServlet("/ListeDestination")
public class ListeDestination extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	@EJB private DestinationService service;


	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Destination> destinations = service.getAllDestinations();
		request.setAttribute("destinations",destinations);
		
		String page = "/index.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
