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
 * Servlet implementation class ListeDestinationGererServlet
 */
@WebServlet("/ListeDestinationGererServlet")
public class ListeDestinationGererServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB private DestinationService service;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Destination> destinations = service.getAllDestinations();
		request.setAttribute("destinations",destinations);
		
		String page = "/ListeDestinationGerer.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		if(uname.equals("admin") && password.equals("admin")) {
			response.sendRedirect("ListeDestinationGererServlet");
			
		}else {
			response.sendRedirect("Error.jsp");
		}
		doGet(request, response);
	}

}
