package fr.gtm.bovoyages.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="dates_voyages")
public class DatesVoyage implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pk_date_voyage")
	private int id;
	@Column(name="date_depart")
	private Date dateDepart;
	@Column(name="date_retour")
	private Date dateRetour;
	private double prixHT;
	
	//bi-directional many-to-one association to Destination
	@ManyToOne
	@JoinColumn(name="fk_destination", nullable=false)
	private Destination destination;

	//bi-directional many-to-one association to Voyage
	@OneToMany(mappedBy="datesVoyage")
	private List<Voyage> voyages;
	
	public DatesVoyage() {}

	public DatesVoyage(Date dateDepart, Date dateRetour, double prixHT) {
		this.dateDepart = dateDepart;
		this.dateRetour = dateRetour;
		this.prixHT = prixHT;
	}
	


	@Override
	public String toString() {
		return "DatesVoyage [id=" + id + ", dateDepart=" + dateDepart + ", dateRetour=" + dateRetour + ", prixHT="
				+ prixHT + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
	
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
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