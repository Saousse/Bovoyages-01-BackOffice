package fr.gtm.bovoyages.dto;

import java.io.Serializable;
import java.util.Date;


public class VoyageurDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String civilite;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	public VoyageurDTO() {}
	
	public VoyageurDTO(String civilite, String nom, String prenom) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}

	public VoyageurDTO(String civilite, String nom, String prenom, Date dateNaissance) {
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
