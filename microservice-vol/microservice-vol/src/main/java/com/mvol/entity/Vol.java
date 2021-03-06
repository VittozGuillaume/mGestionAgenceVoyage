package com.mvol.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String titre;

	private String description;

	private String image;

	private Double prix;

	public Vol() {
		super();
	}

	public Vol(int id, String titre, String description, String image, Double prix) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.image = image;
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Vol [id=" + id + ", titre=" + titre + ", description=" + description + ", image=" + image + ", prix="
				+ prix + "]";
	}

	public Vol(String titre, String description) {
		super();
		this.titre = titre;
		this.description = description;
	}
	
	

}
