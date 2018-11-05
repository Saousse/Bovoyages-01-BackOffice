
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

import fr.gtm.bovoyages.dao.CommercialDAO;
import fr.gtm.bovoyages.dao.DestinationDAO;
import fr.gtm.bovoyages.entities.Commercial;
import fr.gtm.bovoyages.entities.Destination;


@WebServlet("/BackOfficeServlet")
public class BackOfficeServlet extends HttpServlet {
	@EJB
	CommercialDAO dao;
	@EJB
	DestinationDAO destinationDAO; 
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String page = "/Login.jsp"; // par d�faut on consid�re que l'authentification sera fausse, on repart sur la
									// page de login

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username != null && password != null) {
			Commercial commercial = dao.getCommercial(username, password);
			if (commercial != null) {
				List<Destination> destinations = destinationDAO.getAllDestinations();
				request.setAttribute("destinations",destinations);
				page = "/ListeDestinationGerer.jsp"; // commercail authentifi�, on laisse passer vers la partie admin
			}
		}
		// redirection c�t� serveur par RequestDispatcher
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
