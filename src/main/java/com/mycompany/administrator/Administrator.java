/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.administrator;

import com.mycompany.data.Car;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

/**
 *
 * @author TAURAS
 */
public class Administrator {

    public static List<Car> carList = new ArrayList<Car>();

}

public void addCar() {

        carList.add(new Car(1, "123", "214", CarPrice.Medium, rentAvailible));
    }

      public void setRezervation(int ID, int dayStart, int dayEnd) {

        for (int i = 0; i < carList.size(); i++) {

            if (carList.get(i).getID() == ID) {
                for (int a = dayStart; a <= dayEnd; a++) {
                    if (!carList.get(i).getRentAvailible()[a]) {
                        System.out.println(" Car " + a + " day is not availible");
                        break;

                    } else {
                        

                        carList.get(i).getRentAvailible()[a] = false;
                        System.out.println("Car " + carList.get(i).getPlateNumber() + " is reserved for " + a + "day.");
                    }

                }
            } else {
                System.out.println("Wrong ID");
            }

        }

}
