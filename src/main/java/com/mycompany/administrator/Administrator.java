/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.administrator;

import com.mycompany.data.Car;
import com.mycompany.data.CarPrice;
import com.mycompany.data.DataOutput;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author TAURAS
 */
public class Administrator {

   

    private static List<Car> carList = new ArrayList<Car>();

    public void addCar(int ID, String brand, String plateNumber, CarPrice carPrice) {

        carList.add(new Car(ID, brand, plateNumber, carPrice));

    }

    public List<Car> showAll() {
        List<Car> allList = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {

            allList.add(carList.get(i));

        }
        return allList;
    }

    public void rezervation(int ID, int startDay, int endDay) {
        DataOutput        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getID() == ID) {

                if (checkRezervation(i, startDay, endDay)) {

                   
                }

            }
            if (carList.contains(carList.get(i).getID())) {
                System.out.println("Wrong ID");

            }

        }

    }

    public boolean checkRezervation(int car, int startDay, int endDay) {

        for (int a = startDay; a <= endDay; a++) {
            if (carList.get(car).getRentAvailible()[a]) {

                carList.get(car).getRentAvailible()[a] = false;

            } else {
                System.out.println("");
                return false;
            }

        }
        return true;
    }
}
