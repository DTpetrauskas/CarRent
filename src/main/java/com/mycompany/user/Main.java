/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.user;

import com.mycompany.administrator.Administrator;
import com.mycompany.data.CarPrice;
import com.mycompany.data.DataOutputImpl;
import com.mycompany.data.OutFail;
import com.mycompany.data.RentDataOutput;

/**
 *
 * @author TAURAS
 */
public class Main {
    
    public static void main(String[] args) {
        DataOutputImpl out = new DataOutputImpl();
        
        out.success(new RentDataOutput() {
            @Override
            public void out(int ID) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        out.fail(new RentDataOutput() {
            @Override
            public void out(int ID) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        Administrator admin = new Administrator();
        admin.addCar(1, "BMW", "!$@#$", CarPrice.Luxury);
        admin.rezervation(1, 20, 30);
    }
}
