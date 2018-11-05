package fr.gtm.bovoyages.servlet;


//*************************************
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import fr.gtm.bovoyages.dao.DestinationDAO;
import fr.gtm.bovoyages.entities.Destination;

/**
 * Servlet implementation class SimpleUploadServlet
 */
@WebServlet("/MultipleUploadServlet")
@MultipartConfig
public class MultipleUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final static Logger LOGGER = Logger.getLogger(MultipleUploadServlet.class.getCanonicalName());
	
	@EJB DestinationDAO dao;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String folder = getServletContext().getInitParameter("upload-folder");
		
		///////////////////////////////////////////////////
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		///////////////////////////////////////////////////
		
		// getParameter fonctionne en enctype="multipart/form-data" grace � l'annotation @MultipartConfig
		// r�cup�ration de la description et de la r�gion
		String region = request.getParameter("region");
		String description = request.getParameter("description");
		
		Destination destination = new Destination();
		destination.setRegion(region);
		destination.setDescription(description);
		
		Collection<Part> parts = request.getParts();
		List<String> images = new ArrayList<>();
		
		for(Part filePart : parts){
			final String fileName = getFileName(filePart);
			if(fileName == null)
				continue; // le part content n'est pas de type 'filename'
			Path path = FileSystems.getDefault().getPath(folder, fileName);
			
			// on ajoute l'image aux images
			images.add(fileName);
			
			if(!path.toFile().exists()){
				InputStream in = filePart.getInputStream();
				Files.copy(in, path);
				in.close();
				filePart.delete();
			}
			else{
				// il faut pr�voir un traitement sp�cifique si le fichier existe d�j�
				//		demander l'accord de l'utilisateur
				//		toujours remplacer le fichier
				//		...
				LOGGER.info(">>> Le fichier "+fileName+" existe d�j� dans la destination, il ne sera pas recopi�");
			}
		}
		
		// Mise � jour de la destination avec les images
		destination.setImages(images);
		dao.save(destination);
		
		// retour � la page qui affiche les destinations pour le back office
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/AddDestinationServlet");
		rd.forward(request, response);
	}


	private String getFileName(Part part) {
		final String partHeader = part.getHeader("content-disposition");
	    LOGGER.log(Level.INFO, "Part Header = {0}", partHeader);
	    for (String content : part.getHeader("content-disposition").split(";")) {
	        if (content.trim().startsWith("filename")) {
	            return content.substring(
	                    content.indexOf('=') + 1).trim().replace("\"", "");
	        }
	    }
	    return null;
	}

}
