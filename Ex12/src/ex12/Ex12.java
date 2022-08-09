/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;

import java.util.Date;

public class Ex12 {

    public static void main(String[] args) {

        Date date1 = new Date(10000);
        System.out.println("Date 1: " + date1.toString());
        
        Date date2 = new Date(100000);
        System.out.println("Date 2: " + date2.toString());
        
        Date date3 = new Date(1000000);
        System.out.println("Date 3: " + date3.toString());
        
        Date date4 = new Date(10000000);
        System.out.println("Date 4: " + date4.toString());
        
        Date date5 = new Date(100000000);
        System.out.println("Date 5: " + date5.toString());
        
        Date date6 = new Date(1000000000);
        System.out.println("Date 6: " + date6.toString());
        
        // Too large integer!
//        Date date7 = new Date(10000000000);
//        System.out.println("Date 7: " + date7.toString());
//        
//        Date date8 = new Date(100000000000);
//        System.out.println("Date 8: " + date8.toString());
    }
    
}
