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
import fr.gtm.bovoyages.dao.DestinationDAO;



@WebServlet("/AddDestinationServlet")
public class AddDestinationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB private DestinationDAO dao;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String region = request.getParameter("region");
		String description = request.getParameter("description");

//		if(region!=null && !region.isEmpty() && description!=null && !description.isEmpty() ) {
//			Destination destination = new Destination(region, description);
//			dao.save(destination);
//		}
		
		List<Destination> destinations = dao.getAllDestinations();
		request.setAttribute("destinations",destinations);
		
		String page = "/ListeDestinationGerer.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
