package com.example.REST_ws;

//package library.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

//couche services: implémentation des méthodes liées 

@RestController

public class RentService{
	
	List<Car> list = new ArrayList<Car>();
	List<Car> rented=new ArrayList<Car>();//voitures louées
	
	public RentService() {
		//Constructeur par défaut -> création d'un conteneur de voitures
		list.add(0,new Car(1, "Ferrari",500, "manual", 2, true, true, null, null));
		list.add(1,new Car(2, "Mini cooper",200, "manual", 5, true, true, null, null));
		list.add(2,new Car(3, "Toyota",160, "manual", 5, true, true, null, null));
		list.add(3,new Car(4, "Audi",190, "auto", 4, true, true, null, null));
		list.add(4,new Car(5, "Renault",120, "auto", 5, true, true, null, null));
		
	}
	
    //Affiche la liste de toutes les voitures
	public List<Car>listOfCar(){
		
		return list;
	}
	
	
	//Affiche les infos d'une voiture à partir de son URN
	public Car viewCar(int id){//throws Exeption à ajouter car on peut accéder à une voiture inexistante (id=0)
		
		Car car= new Car(0, null, 0, null, 0, false, false, null, null);

		for(int i=0;i<list.size();i++) {
			if((i+1)==id) {
				car=list.get(id-1);
			}
		}
		return car;
	}
	
/*	
	//Côté client ?, requêtes ?
	public void rentCar(int id) {	
		
		availableCars();// récupération d'une variable qui indique si
	}
	
*/
	
	public void rentACar(int id) {
		Car c;
		for(int i=0;i<list.size();i++){
			if((i+1)==id) {
				c=list.get(i);
				c.setDisp(false);
			    //c.list.get(i)= c;
				list.set(i, c);
				//list.get(i).setDisp(false);
			}
		}	
	}
		
	public void getBackACar(int id){
		
		for(int i=0;i<list.size();i++){
			if((i+1)==id) {
				list.get(id).setDisp(true);
			}
		}	
	}
	
	
	public void rentAndGetBack(int id, boolean rent) {
		
		if(rent==true) {
			rentACar(id);
		}
		else {
			getBackACar(id);
		}
	}
	
	
	//ME - Affiche uniquement les voitures disponibles
	public List<Car>availableCars(){
		List<Car>l=new ArrayList<Car>();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).isDisp()==true) {
				l.add(list.get(i));//voitures non louées
			}
			else {
				rented.add(list.get(i));//ajouter à la liste des voitures non dispos = louées
			}
		}
		
		return l;
	}
}