/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hellomaven;

import client.CL_User;
import java.util.ArrayList;
import java.util.List;
import sun.util.cldr.CLDRLocaleProviderAdapter;

/**
 *
 * @author gihal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] users = new String[]{"Gihal","Gayani","Diyon"};
        List<CL_User> clUsers = new ArrayList<CL_User>();
        int counter = 0;
        for (String user : users) {
            clUsers.add(new CL_User(counter, user, user));
            counter++;
        }
        
        for (CL_User clUser : clUsers) {
            System.out.println(clUser);
        }
        System.out.println("Hello world!!!");
    }
    
}
