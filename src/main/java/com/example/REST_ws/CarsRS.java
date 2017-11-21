package com.example.REST_ws;

/*
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;//ajouté
*/
//"plateNumber" remplacé partout par "id"
//String id remplacés par int id

/*
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import java.util.ArrayList;
import java.util.List;*/



 class CarsRS {
	/*
		@RequestMapping(value = "/cars", method = RequestMethod.GET)
		@ResponseStatus(HttpStatus.OK)
		@ResponseBody
		public List<Cars>listOfCars(){//création d'un conteneur de voitures
			List<Cars> list = new ArrayList<Cars>();
			list.add(0,new Cars(1, "Ferrari",500, "manual", 2, true, true));
			list.add(1,new Cars(2, "Mini cooper",200, "manual", 5, true, true));
			list.add(2,new Cars(3, "Toyota",160, "manual", 5, true, true));
			list.add(3,new Cars(4, "Audi",190, "auto", 4, true, true));
			list.add(4,new Cars(5, "Renault",120, "auto", 5, false, true));
			
	        return list;
		}*/
		
	/*
		@RequestMapping(value = "/cars/{id}", method = RequestMethod.GET)
		@ResponseStatus(HttpStatus.OK)
		@ResponseBody
		public Cars aCar(@PathVariable("id") int id) throws Exception{
			
			Cars c= new Cars(id, null,0, null, 0, false, false);
			String m=c.getModel();
			int p=c.getPrice();
			String bv=c.getBoite_vitesse();
			int places=c.getPlaces();
			boolean clim=c.isClim();
			boolean disp=c.isDisp();
			
			Cars car= new Cars(id, m, p, bv, places, clim,disp);
			
			return car; //retourner une voiture
		}*/
		
		/*
		@RequestMapping(value = "/cars/{id}", method = RequestMethod.DELETE)
		@ResponseStatus(HttpStatus.OK)
		public void getBack(@PathVariable("id") int id) throws Exception{
		}
		
		
		@RequestMapping(value = "/cars/{id}", method = RequestMethod.PUT)
		@ResponseStatus(HttpStatus.OK)
		public void rent(@PathVariable("id") int id) throws Exception{
		}
		
		
		@RequestMapping(value = "/voiture/{id}", method = RequestMethod.PUT)
		@ResponseStatus(HttpStatus.OK)
		public void rentAndGetBack(@PathVariable("id") int id,
		@RequestParam(value="rent", required = true)boolean rent) throws Exception{
		}*/
}
