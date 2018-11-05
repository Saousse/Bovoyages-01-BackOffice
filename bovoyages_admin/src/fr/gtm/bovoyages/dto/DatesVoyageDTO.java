package fr.gtm.bovoyages.dto;

import java.io.Serializable;
import java.util.Date;


public class DatesVoyageDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Date dateDepart;
	private Date dateRetour;
	private double prixHT;
	
	public DatesVoyageDTO() {}

	public DatesVoyageDTO(Date dateDepart, Date dateRetour, double prixHT) {
		this.dateDepart = dateDepart;
		this.dateRetour = dateRetour;
		this.prixHT = prixHT;
	}

	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}

	public Date getdateDepart() {
		return dateDepart;
	}

	public void setdateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	
	

}
