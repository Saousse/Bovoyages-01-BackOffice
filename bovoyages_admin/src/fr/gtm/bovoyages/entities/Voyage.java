package fr.gtm.bovoyages.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="voyages")
public class Voyage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pk_voyage")
	private int id;
	private String region;
	private String descriptif;
//	private DatesVoyage datesVoyage;
	
//	@ManyToMany(cascade=CascadeType.ALL)
//	@JoinTable(name="voyages_voyageurs", joinColumns= {@JoinColumn(name=" fk_voyage")})
//	private List<Voyageur> voyageurs = new ArrayList<>();
	
	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="fk_client")
	private Client client;

	//bi-directional many-to-one association to DatesVoyage
	@ManyToOne
	@JoinColumn(name="fk_dates_voyage", nullable=false)
	private DatesVoyage datesVoyage;

	//bi-directional many-to-many association to Voyageur
	@ManyToMany
	@JoinTable(
		name="voyages_voyageurs"
		, joinColumns={
			@JoinColumn(name="fk_voyage", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="fk_voyageur", nullable=false)
			}
		)
	private List<Voyageur> voyageurs;
	
	public Voyage() {}
		
	public Voyage(String region, String descriptif) {
		this.region = region;
		this.descriptif = descriptif;
	}

	public Voyage(String region, String descriptif, DatesVoyage datesVoyage) {
		this.region = region;
		this.descriptif = descriptif;
		this.datesVoyage = datesVoyage;
	}

	public Voyage(String region, String descriptif, DatesVoyage datesVoyage, List<Voyageur> voyageurs) {
		this.region = region;
		this.descriptif = descriptif;
		this.datesVoyage = datesVoyage;
		this.voyageurs = voyageurs;
	}

	public void addVoyageur(Voyageur voyageur) {
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
	public List<Voyageur> getVoyageurs() {
		return voyageurs;
	}
	public void setVoyageurs(List<Voyageur> voyageurs) {
		this.voyageurs = voyageurs;
	}

	public DatesVoyage getDatesVoyage() {
		return datesVoyage;
	}

	public void setDatesVoyage(DatesVoyage datesVoyage) {
		this.datesVoyage = datesVoyage;
	}
	
	

}
