package fr.gtm.bovoyages.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="voyageurs")
public class Voyageur implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pk_voyageur") 
	private int id;
	private String civilite;
	private String nom;
	private String prenom;
	@Column(name="date_naissance")
	private Date dateNaissance;
	
	//bi-directional many-to-many association to Voyage
	@ManyToMany(mappedBy="voyageurs")
	private List<Voyage> voyages;
	
	public Voyageur() {}
	
	public Voyageur(String civilite, String nom, String prenom) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Voyageur(String civilite, String nom, String prenom, Date dateNaissance) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	/**
	 * ID de synchronisation avec la clé primaire
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * ID de synchronisation avec la clé primaire
	 * <h3>Ne doit pas être mis à jour en dehors du DAO</h3>
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	

}
