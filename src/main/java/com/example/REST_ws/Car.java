package com.example.REST_ws;

/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/
import javax.persistence.*;
import java.util.*;

@Entity
public class Car //extends Vehicle
{
	
	private int id;
    private String model;
    private int price;
    private String boite_vitesse;
    private int places;
    private boolean clim;
    private boolean disp;
    private Date date_debut;
    private Date date_fin;
  //ajouter image (et url vers les détails ?) + tard
    
    //@ autowired

    public Car(int id, String model, int price, String boite_vitesse, int places, boolean clim, boolean disp, Date date_debut, Date date_fin) {//constructeur
        this.id = id;
        this.model = model;
        this.price=price;
        this.boite_vitesse=boite_vitesse;
        this.places=places;
        this.clim=clim;
        this.disp=disp;
        this.date_debut=date_debut;
        this.date_fin=date_fin;
    }
 
    @Id
   	@GeneratedValue(strategy = GenerationType.AUTO)//constructeur
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBoite_vitesse() {
		return boite_vitesse;
	}

	public void setBoite_vitesse(String boite_vitesse) {
		this.boite_vitesse = boite_vitesse;
	}

	public int getPlaces() {
		return places;
	}

	public void setPlaces(int places) {
		this.places = places;
	}

	public boolean isClim() {
		return clim;
	}

	public void setClim(boolean clim) {
		this.clim = clim;
	}

	public boolean isDisp() {
		return disp;
	}

	public void setDisp(boolean disp) {
		this.disp = disp;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	
	
	
	
	
	
}