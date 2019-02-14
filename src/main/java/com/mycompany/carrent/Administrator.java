/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrent;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

/**
 *
 * @author TAURAS
 */
public class Administrator  {

    public static List<Car> carList = new ArrayList<Car>();

    

    
    
    
    private List<Car> makeList() {

        for (int i = 0; i < 10; i++) {
            addCar();
            
        }
    }

    public void addCar() {

        carList.add(new Car(1, "123", "214", CarPrice.Medium, rentAvailible));
    }

    public void removeCar(int carNumber) {
        if (Arrays.asList(carList).contains(carNumber)) {

            carList.remove(Arrays.asList(carList).get(carNumber));
        } else {
            System.out.println("NO number");
        }

    }

}
