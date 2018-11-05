package fr.gtm.bovoyages.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fr.gtm.bovoyages.dao.DestinationDAO;
import fr.gtm.bovoyages.dao.DatesVoyageDAO;
import fr.gtm.bovoyages.entities.DatesVoyage;
import fr.gtm.bovoyages.entities.Destination;

@Stateless
public class DestinationService {
	
	@EJB
	private DestinationDAO dao;
	@EJB
	private DatesVoyageDAO daoDV;

	public Destination save(Destination destination) {
		return dao.save(destination);
	}

	public void remove(Destination destination) {
		dao.remove(destination);
	}

	public void update(Destination destination) {
		dao.update(destination);
	}

	public List<Destination> getAllDestinations() {
		return dao.getAllDestinations();
	}
	
	public Destination getDestinationById(int id) {
		return dao.getDestinationById(id);
	}
	
	public List<DatesVoyage> getDatesVoyageById(int id) {
		
		return daoDV.getDatesVoyagesById(id);
	}
					
}
