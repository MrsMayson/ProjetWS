package com.example.REST_ws;


import org.springframework.beans.factory.annotation.Autowired;
import java.util.Calendar;
import java.util.Date;

//couche domaine 

public class Car {
//structure de données des voitures (cf json)
	
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
    
    @Autowired //constructeur
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boite_vitesse == null) ? 0 : boite_vitesse.hashCode());
		result = prime * result + (clim ? 1231 : 1237);
		result = prime * result + ((date_debut == null) ? 0 : date_debut.hashCode());
		result = prime * result + ((date_fin == null) ? 0 : date_fin.hashCode());
		result = prime * result + (disp ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + places;
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (boite_vitesse == null) {
			if (other.boite_vitesse != null)
				return false;
		} else if (!boite_vitesse.equals(other.boite_vitesse))
			return false;
		if (clim != other.clim)
			return false;
		if (date_debut == null) {
			if (other.date_debut != null)
				return false;
		} else if (!date_debut.equals(other.date_debut))
			return false;
		if (date_fin == null) {
			if (other.date_fin != null)
				return false;
		} else if (!date_fin.equals(other.date_fin))
			return false;
		if (disp != other.disp)
			return false;
		if (id != other.id)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (places != other.places)
			return false;
		if (price != other.price)
			return false;
		return true;
	}

    


}
   
