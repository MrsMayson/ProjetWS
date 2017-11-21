package com.example.REST_ws;


import org.springframework.beans.factory.annotation.Autowired;
import java.util.Calendar;
import java.util.Date;

//couche domaine 

public class Car {
//structure de données des voitures (cf json)
	
	private final int id;
    private final String model;
    private final int price;
    private final String boite_vitesse;
    private final int places;
    private final boolean clim;
    private final boolean disp;
    private final Date date_debut;
    private final Date date_fin;
  //ajouter image (et url vers les détails ?) + tard

    @Autowired
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boite_vitesse == null) ? 0 : boite_vitesse.hashCode());
		result = prime * result + (clim ? 1231 : 1237);
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
	

	public int getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	public String getBoite_vitesse() {
		return boite_vitesse;
	}

	public int getPlaces() {
		return places;
	}

	public boolean isClim() {
		return clim;
	}
	public boolean isDisp() {
		return disp;
	}


	public Date getDate_debut() {
		return date_debut;
	}


	public Date getDate_fin() {
		return date_fin;
	}
}
   
