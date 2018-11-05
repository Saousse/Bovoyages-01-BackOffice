package fr.gtm.bovoyages.servlet;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.bovoyages.dao.DestinationDAO;
import fr.gtm.bovoyages.entities.Destination;

/**
 * Servlet implementation class ModifyDestinationServlet
 */
@WebServlet("/ModifyDestinationFormServlet")
public class ModifyDestinationFormServlet extends HttpServlet {
	private static final Logger LOG = Logger.getLogger(ModifyDestinationFormServlet.class.getName());
	private static final long serialVersionUID = 1L;

	@EJB
	private DestinationDAO dao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idStr = request.getParameter("id");
		if(idStr!=null) {
			try{
				int id = Integer.parseInt(idStr);
				Destination d = dao.getDestinationById(id);
				request.setAttribute("destination", d);
			}catch(Exception e) {
				LOG.warning("ModifyDestinationFormServlet --- Probleme sur id : "+idStr );
			}
		}
		
		String page = "/AddDestinationForm.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
