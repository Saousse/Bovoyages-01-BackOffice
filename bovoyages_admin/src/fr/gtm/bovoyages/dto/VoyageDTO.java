package fr.gtm.bovoyages.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class VoyageDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String region;
	private String descriptif;
	private DatesVoyageDTO datesVoyage;
	private List<VoyageurDTO> voyageurs = new ArrayList<>();
	
	public VoyageDTO() {}
		
	public VoyageDTO(String region, String descriptif) {
		this.region = region;
		this.descriptif = descriptif;
	}

	public VoyageDTO(String region, String descriptif, DatesVoyageDTO datesVoyage) {
		this.region = region;
		this.descriptif = descriptif;
		this.datesVoyage = datesVoyage;
	}

	public VoyageDTO(String region, String descriptif, DatesVoyageDTO datesVoyage, List<VoyageurDTO> voyageurs) {
		this.region = region;
		this.descriptif = descriptif;
		this.datesVoyage = datesVoyage;
		this.voyageurs = voyageurs;
	}

	public void addVoyageur(VoyageurDTO voyageur) {
		voyageurs.add(voyageur);
	}
	
	public double getPrixHT() {
		if (voyageurs.size() != 0)
			return voyageurs.size()*datesVoyage.getPrixHT();
		else 
			return datesVoyage.getPrixHT();
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
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	public List<VoyageurDTO> getVoyageurs() {
		return voyageurs;
	}
	public void setVoyageurs(List<VoyageurDTO> voyageurs) {
		this.voyageurs = voyageurs;
	}

	public DatesVoyageDTO getDatesVoyage() {
		return datesVoyage;
	}

	public void setDatesVoyage(DatesVoyageDTO datesVoyage) {
		this.datesVoyage = datesVoyage;
	}
	
	

}
