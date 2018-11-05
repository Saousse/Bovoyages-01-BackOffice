package fr.gtm.bovoyages.service;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import fr.gtm.bovoyages.dao.VoyageDAO;
import fr.gtm.bovoyages.entities.Voyage;

@Singleton
public class VoyageService {
@EJB private VoyageDAO dao;

@POST
public  void save(Voyage voyage) {
	 dao.save(voyage);
}
@POST
public void delete(Voyage voyage) {
	dao.delete(voyage);
}
@POST
public void update(Voyage voyage) {
	dao.update(voyage);
}
@POST
public void saveOrUpdate(Voyage voyage) {
	dao.saveOrUpdate(voyage);
}
@GET
public Voyage getDatesVoyageById(int id) {
  return dao.getDatesVoyageById(id);

}
}