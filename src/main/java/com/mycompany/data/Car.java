/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.data;

import java.util.Arrays;

/**
 *
 * @author TAURAS
 */
public class Car {

    private int ID = 0;
    private String brand;
    private String plateNumber;
    private CarPrice carPrice;
    private boolean rentAvailible[] = new boolean[365];

    
    
     public Car(int ID, String brand, String plateNumber, CarPrice carPrice) {

        Arrays.fill(rentAvailible, true);

        this.ID = ID;
        this.brand = brand;
        this.plateNumber = plateNumber;
        this.carPrice = carPrice;
        
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public CarPrice getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(CarPrice carPrice) {
        this.carPrice = carPrice;
    }

    public boolean[] getRentAvailible() {
        return rentAvailible;
    }

    public void setRentAvailible(boolean[] rentAvailible) {
        this.rentAvailible = rentAvailible;
    }

   

}
