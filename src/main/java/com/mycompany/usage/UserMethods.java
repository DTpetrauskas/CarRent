/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usage;

import com.mycompany.administrator.Administrator;

/**
 *
 * @author TAURAS
 */
public class UserMethods extends Administrator {

    @Override
    public void showAll() {

        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).toString());
        }

    }

    @Override
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

}
