package fr.gtm.bovoyages.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the images database table.
 * 
 */
@Entity
@Table(name="images")
@NamedQuery(name="Image.findAll", query="SELECT i FROM Image i")
public class Image implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable=false, length=50)
	private String image;

	//bi-directional many-to-one association to Destination
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_destination", nullable=false)
	private Destination destination;

	public Image() {
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Destination getDestination() {
		return this.destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

}