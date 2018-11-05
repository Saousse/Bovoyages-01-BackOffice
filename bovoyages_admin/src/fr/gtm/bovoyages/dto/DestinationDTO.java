package fr.gtm.bovoyages.dto;

import java.io.Serializable;

import fr.gtm.bovoyages.entities.Destination;


/**
 * Classe modélisant une destination de voyage<br>
 * Cette classe contient aussi le nom des images utilisées pour les affichages<br>
 * @author franck
 *
 */
public class DestinationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String region;
	private String description;
	private DatesVoyageDTO datePromo;
	private String imageVignette ;
	
	
	public DestinationDTO() {}
	
	public DestinationDTO(String region, String description) {
		this.region = region;
		this.description = description;
	}
	
	public DestinationDTO(Destination destination) {
		this.id = destination.getId();
		this.region = destination.getRegion();
		this.description = destination.getDescription();
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	
	public DatesVoyageDTO getDatePromo() {
		return datePromo;
	}

	public void setDatePromo(DatesVoyageDTO datePromo) {
		this.datePromo = datePromo;
	}

	public String getImageVignette() {
		return imageVignette;
	}

	public void setImageVignette(String imageVignette) {
		this.imageVignette = imageVignette;
	}

	
	

}
