/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.user;

import com.mycompany.administrator.Administrator;
import com.mycompany.data.CarPrice;

/**
 *
 * @author TAURAS
 */
public class Main {

    public static void main(String[] args) {

        Administrator admin = new Administrator();
        admin.addCar(1, "BMW", "!$@#$", CarPrice.Luxury);
        admin.rezervation(1, 20, 30);
    }
}
