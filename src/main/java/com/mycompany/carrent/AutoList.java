/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrent;

import java.util.ArrayList;
import java.util.List;
import org.vytas.shopas.model.Preke;





/**
 *
 * @author TAURAS
 */
public class AutoList{

    private boolean[] rentAvailible;
    
    
    public List<Car> loadList() {

		List<Car> list = new ArrayList<Car>();

		list.add(new Car(1, "", "", CarPrice.Medium, rentAvailible));
                
                
		list.add(new Car(2, "", "", CarPrice.Medium, rentAvailible));

		return list;

	}

   
    
  
    
    
    
    }

