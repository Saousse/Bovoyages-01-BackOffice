package fr.gtm.bovoyages.dao;


import java.util.List;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.gtm.bovoyages.entities.Destination;

/**
 * Contient les methodes des requetes de donnees; 
 * Instancie la DataSource
 * Utilise 'getConnection'
 */

@Singleton
public class DestinationDAO {
	
	@PersistenceContext(name="bovoyages") 
	private EntityManager em; 
	
//	private static final Logger LOG = Logger.getLogger(DestinationDAO.class.getName());
	
	public DestinationDAO() {

	}
	
	/*******************************************************************************
     * Methode permettant de rechercher toutes les destinations visibles et cachees
     * @return Retourne la liste de destinations visibles et cachees
     *******************************************************************************/
	public List<Destination> getAllDestinations() {
		List<Destination> destinations = em.createNamedQuery("allDestinations",Destination.class).getResultList();
		return destinations;
	}
	
	//-----------------------------------------------------------------------------------------------------------------
	//-------------------------------les modifs du 05/11/18 ------------------------------------------------------------
	/*******************************************************************************
     *  Methode permettant de rechercher toutes les destinations visibles
     * @return Retourne la liste de destinations visibles
     *******************************************************************************/
	public List<Destination>allDestinationsVisible(){
		List<Destination> destinations = em.createNamedQuery("allDestinationsVisible",Destination.class).getResultList();
		return destinations;		
	}
	
	/*******************************************************************************
     *  Methode permettant de rechercher toutes les destinations cachés
     * @return Retourne la liste de destinations cachée
     *******************************************************************************/
	public List<Destination>allDestinationsHidden(){
		List<Destination> destinations = em.createNamedQuery("allDestinationsHidden",Destination.class).getResultList();
		return destinations;
	}
	//----------------------------- Fin Modif ---------------------------------------------------------
	//-------------------------------------------------------------------------------------------------
	
	public Destination getDestinationById(int id) {
		return em.find(Destination.class, id);
	}

	public Destination getDestinationByDateVoyage(int id) {
		return em.find(Destination.class, id);
	}
	
	


	//<---------------------------------------------------------------------------------------------------->
	//<------------------------------------------C-R-U-D--------------------------------------------------->	
	//<---------------------------------------------------------------------------------------------------->	

	
	public void saveOrUpdate(Destination destination) {
		if(destination.getId() == 0) {
			save(destination);
		}else {
			update(destination);
		}
	}

	public Destination save(Destination  destination) {
		em.persist(destination);
		return destination;
	}
	
	public void remove(Destination  destination) {
		Destination d1 = em.find(Destination.class, destination.getId());
		em.remove(d1);	
	}
	
	public void update(Destination  destination) {
		em.merge(destination);
	}
	
	
	/*
	 * Quelques méthodes utilitaires pour éviter de perdre les images et DatesVoyage
	 * 
	 */
	
	public void updateSansToucherDates(Destination destination) {
		Destination d = em.find(Destination.class, destination.getId());
		d.setRegion(destination.getRegion());
		d.setDescription(destination.getDescription());
		d.setImages(destination.getImages());
		em.merge(d);	
	}
	
	public void updateSansToucherDatesNiImages(Destination destination) {
		Destination d = em.find(Destination.class, destination.getId());
		d.setRegion(destination.getRegion());
		d.setDescription(destination.getDescription());
		em.merge(d);
	}
		
}
	
	
	
	
	
	
	


		

	