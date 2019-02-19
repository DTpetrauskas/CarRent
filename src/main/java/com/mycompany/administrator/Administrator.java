/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.administrator;

import com.mycompany.data.Car;
import com.mycompany.data.CarPrice;
import com.mycompany.data.DataOutputImpl;
import com.mycompany.data.Day;
import com.mycompany.ui.UIHandler;

import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author TAURAS
 */
public class Administrator {

    public static List<Car> carList = new ArrayList<Car>();
    public static List<Day> dayList = new ArrayList<Day>();
    private UIHandler ui;

    public Administrator(UIHandler ui) {
        this.ui = ui;
    }

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

        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getID() == ID) {

                if (checkRezervation(i, startDay, endDay)) {

                    ui.out("Success: " + ID);
                } else {
                    ui.out("Fail: " + ID);
                }

            } else if (carList.get(i).getID() != ID) {
                ui.out("Another fail: " + ID);
            }

        }

    }

    public boolean checkRezervation(int car, int startDay, int endDay) {

        for (int a = startDay; a <= endDay; a++) {
            if (carList.get(car).getRentAvailible()[a]) {

                carList.get(car).getRentAvailible()[a] = false;

            } else {
                ui.outEmpty();
                return false;
            }

        }
        return true;
    }

    public void showDayInterval(int car, int startDay, int endDay) {

        for (int d = startDay; d <= endDay; d++) {
            carList.get(car).getRentAvailible()[d]
    
                    

    
        }
    }
}
