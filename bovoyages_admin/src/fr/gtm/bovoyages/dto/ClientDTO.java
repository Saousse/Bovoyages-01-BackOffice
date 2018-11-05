package fr.gtm.bovoyages.dto;

import java.io.Serializable;

public class ClientDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nom;
	
	public ClientDTO() {}
	
	public ClientDTO(String nom) {
		this.nom = nom;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
