
package fr.gtm.bovoyages.servlet;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.gtm.bovoyages.dao.CommercialDAO;
import fr.gtm.bovoyages.entities.Commercial;

@WebServlet("/BackOfficeServlet")
public class LoginServlet extends HttpServlet {
	@EJB
	CommercialDAO dao;
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String page = "/login.jsp"; // par défaut on considère que l'authentification sera fausse, on repart sur la
									// page de login

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username != null && password != null) {
			Commercial commercial = dao.getCommercial(username, password);
			if (commercial != null) {
				page = "/AddDestinationServlet"; // commercail authentifié, on laisse passer vers la partie admin
			}
		}
		// redirection côté serveur par RequestDispatcher
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}