package fr.gtm.bovoyages.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe mod�lisant un client
 * Le voyage est pay� par le client
 * Le client peut-etre une personne ou un organisme.
 * @author franck
 *
 */
@Entity
@Table(name="clients")

public class Client implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pk")
	private int id;
	private String nom;
	
	//bi-directional many-to-one association to Voyage
	@OneToMany(mappedBy="client")
	private List<Voyage> voyages;
	
	public Client() {}
	
	public Client(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + "]";
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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
