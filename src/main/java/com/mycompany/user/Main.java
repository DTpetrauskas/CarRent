/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.user;

import com.mycompany.administrator.Administrator;
import com.mycompany.data.CarPrice;
import com.mycompany.data.DataOutputImpl;
import com.mycompany.ui.SwingUI;
import com.mycompany.ui.UIHandler;
import java.util.Scanner;

/**
 *
 * @author TAURAS
 */
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        UIHandler out = new SwingUI();

        Administrator admin = new Administrator(out);
        admin.addCar(1, "BMW", "!$@#$", CarPrice.Luxury);
        admin.rezervation(1, 20, 30);
    }
}
