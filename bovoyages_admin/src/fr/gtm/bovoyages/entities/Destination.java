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
 * Classe modï¿½lisant une destination de voyage<br>
 * Cette classe contient aussi le nom des images utilisï¿½es pour les affichages<br>
 * @author franck
 *
 */
@Entity
@Table(name="destinations")
@NamedQueries({
	//****************** Requete pour récupérer toutes les destinations ********************************
	@NamedQuery(name="allDestinations",query="select d from Destination d"),
	//@NamedQuery(name="allDestinations",query="select d from Destination d where d.region =:region"),
	
	//--------------------------------------------------------------------------------------------------
	//-------------------------- les modifs du 06/11/18---------------------------------------------------
	//****************** Requete pour recuperer que les destinations visibles **************************
	@NamedQuery(name="allDestinationsVisible",query="SELECT d FROM Destination d WHERE d.hidden = 1"),
	
	//****************** Requete pour recuperer les destinations non visibles **************************
	@NamedQuery(name="allDestinationsHidden",query = " SELECT d FROM Destination d WHERE d.hidden = 0")
	
	
	//-------------------------- Fin Modif ----------------------------------------------------------
	//--------------------------------------------------------------------------------------------------
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
	//-------------------------------------------------------------------------------------------------
	//-------------------------- les modifs du 06/11/18 -----------------------------------------------
	//***** hidden indique si la destination est cachée(0) ou non (1)
	private int hidden;
	//***** nb_max indique le nombre de place pour la destination
	private int nb_max;
	//---------------------------- Fin Modif ----------------------------------------------------------
	//-------------------------------------------------------------------------------------------------
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name = "images", joinColumns= {@JoinColumn(name="fk_destination")})
	@Column(name="image")
	private List<String> images = new ArrayList<String>();
	
	//-------------------------------------------------------------------------------------------------
	//---------------------------- les modifs du 06/11/18 ---------------------------------------------
	//******* Jointure de table ***********************************************************************
	//***** ajout de 	fetch = FetchType.LAZY à la jointure*******************************************
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	//----------------------------- Fin Modif ---------------------------------------------------------
	//-------------------------------------------------------------------------------------------------
	@JoinColumn(name="fk_destination")
	private List<DatesVoyage> datesVoyages = new ArrayList<>();
	
	public Destination() {}
	
	public Destination(String region, String description) {
		this.region = region;
		this.description = description;
	}
	


	/**
	 * ID de synchronisation avec la clï¿½ primaire
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * ID de synchronisation avec la clï¿½ primaire
	 * <h3>Ne doit pas ï¿½tre mis ï¿½ jour en dehors du DAO</h3>
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
	//-------------------------------------------------------------------------------------------------
	//---------------------------- les modifs du 06/11/18 ---------------------------------------------
	public int getHidden() {
		return hidden;
	}

	public void setHidden(int hidden) {
		this.hidden = hidden;
	}

	public int getNb_max() {
		return nb_max;
	}

	public void setNb_max(int nb_max) {
		this.nb_max = nb_max;
	}
	
	
	@Override
	public String toString() {
		return "Destination [id=" + id + ", region=" + region + ", description=" + description + ", hidden=" + hidden
				+ ", nb_max=" + nb_max + ", images=" + images + ", datesVoyages=" + datesVoyages + "]";
	}
	//----------------------------- Fin Modif ---------------------------------------------------------
	//-------------------------------------------------------------------------------------------------
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
