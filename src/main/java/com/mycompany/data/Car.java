/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrent;

import java.util.Arrays;

/**
 *
 * @author TAURAS
 */
public class Car {

    int carNumber = 0;
    String brand;
    String plateNumber;
    private CarPrice carPrice;
    boolean rentAvailible[] = new boolean[365];

    public Car(int carNumber, String brand, String plateNumber, CarPrice carPrice, boolean[] rentAvailible) {

        Arrays.fill(rentAvailible, true);

        this.carNumber = carNumber;
        this.brand = brand;
        this.plateNumber = plateNumber;
        this.carPrice = carPrice;
        this.rentAvailible = rentAvailible;
    }

}
