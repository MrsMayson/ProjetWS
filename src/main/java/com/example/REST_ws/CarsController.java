package com.example.REST_ws;
//package library.controller;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;//généré par eclipse:debug
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//couche web = appels fonctions Rentservices

@RestController

public class CarsController{
	RentService rentservice= new RentService();
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Car>listOfCars(){
		
        return rentservice.listOfCar();
	}
	
	@RequestMapping(value = "/cars/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Car viewCar(@PathVariable("id") int id){//throws Exeption à ajouter car on peut accéder à une voiture inexistante (id=0)
		return rentservice.viewCar(id); //afficher une voiture à partir de son urn
	}
	

	@RequestMapping(value = "/cars/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void getBack(@PathVariable("id") int id){ 
		rentservice.getBackACar(id);	}
	
	/*             FONCTIONNE 
	@RequestMapping(value = "/cars/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void rent(@PathVariable("id") int id){ 
		rentservice.rentACar(id);
	}*/
	
	/*             FONCTIONNE	                                    */
	@RequestMapping(value = "/cars/{id}", method = RequestMethod.PUT)         
	@ResponseStatus(HttpStatus.OK)
	public void rentAndGetBack(@PathVariable("id") int id,
	@RequestParam(value="rent", required = true)boolean rent){ 
		
		if(rent==true) System.out.println("Louer");
		if(rent==false) System.out.println("Rendre");
		rentservice.rentAndGetBack(id, rent);
	}
	

}





