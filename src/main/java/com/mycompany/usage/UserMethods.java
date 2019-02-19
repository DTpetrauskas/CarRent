/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usage;

import com.mycompany.administrator.Administrator;
import com.mycompany.ui.UIHandler;

/**
 *
 * @author TAURAS
 */
public class UserMethods extends Administrator {

    private UIHandler ui;

    public UserMethods(UIHandler ui) {
        super(ui);
    }

    @Override
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
}
