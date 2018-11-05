package fr.gtm.bovoyages.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe mod�lisant une destination de voyage<br>
 * Cette classe contient aussi le nom des images utilis�es pour les affichages<br>
 * @author franck
 *
 */
@Entity
@Table(name="destinations")
@NamedQueries({
	@NamedQuery(name="allDestinations",query="select d from Destination d") //,
	//@NamedQuery(name="allDestinations",query="select d from Destination d where d.region =:region"),
})


public class Destination implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name="pk_destination")
	private int  id;
	private String region;
	private String description;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name = "images", joinColumns= {@JoinColumn(name="fk_destination")})
	@Column(name="image")
	private List<String> images = new ArrayList<String>();
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_destination")
	private List<DatesVoyage> datesVoyages = new ArrayList<>();
	public Destination() {}
	
	public Destination(String region, String description) {
		this.region = region;
		this.description = description;
	}
	


	/**
	 * ID de synchronisation avec la cl� primaire
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * ID de synchronisation avec la cl� primaire
	 * <h3>Ne doit pas �tre mis � jour en dehors du DAO</h3>
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	public void addDatesVoyage(DatesVoyage dates) {
		datesVoyages.add(dates);
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
	
	

	@Override
	public String toString() {
		return "Destination [id=" + id + ", region=" + region + ", description=" + description + ", images=" + images
				+ ", datesVoyages=" + datesVoyages + "]";
	}

	public List<DatesVoyage> getDatesVoyages() {
		return datesVoyages;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public void setDatesVoyages(List<DatesVoyage> datesVoyages) {
		this.datesVoyages = datesVoyages;
	}

	
	

}
