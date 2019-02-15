/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.administrator;

import com.mycompany.data.Car;
import com.mycompany.data.CarPrice;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

/**
 *
 * @author TAURAS
 */
public class Administrator {
     boolean check;

    public static List<Car> carList = new ArrayList<Car>();

    public void addCar() {

        carList.add(new Car(1, "123", "214", CarPrice.Economy));
    }

    public List<Car> showAll() {
        List<Car> allList = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {

            allList.add(carList.get(i));

        }
        return allList;
    }

    public boolean checkRezervation(int ID, int startDay, int endDay) {
        boolean bo;
        for (int i = 0; i < carList.size(); i++) {

            if (carList.get(i).getID() == ID) {
                for (int a = startDay; a <= endDay; a++) {
                    if (carList.get(i).getRentAvailible()[a]) {

                        carList.get(i).getRentAvailible()[a]= false;

                    } else {

                        return false;

                    }

                }
            } else {
                System.out.println("Wrong ID");
                return false;
            }

        }
return true;
    }

    public List<Car> rezervation(){
        
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < carList.size(); )
    
    
    
    
    
    }
}
