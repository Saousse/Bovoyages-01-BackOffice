package fr.gtm.bovoyages.dao;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.gtm.bovoyages.entities.Voyage;


@Singleton
public class VoyageDAO {
@PersistenceContext(name="bovoyages") private EntityManager em; 
	public VoyageDAO() {
		// TODO Auto-generated constructor stub
	}

	
	public void save(Voyage voyage) {
		em.persist(voyage);	

	}

	
	public void delete(Voyage voyage) {
		Voyage v1 = em.find(Voyage.class, voyage.getId());
		em.remove(v1);
	}

	
	public void update(Voyage voyage) {
		em.merge(voyage);

	}

	
	public void saveOrUpdate(Voyage voyage) {
		if(voyage.getId()==0) {
			save(voyage);
		}else {
			update(voyage);
		}	

	}

	public Voyage getDatesVoyageById(int id) {
		return em.find(Voyage.class, id);
		
	}

}
