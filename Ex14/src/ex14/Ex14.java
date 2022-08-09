/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex14;

import java.util.GregorianCalendar;

public class Ex14 {

    public static void main(String[] args) {
        GregorianCalendar G1 = new GregorianCalendar();
        System.out.println("Current year, month and day: " + G1.get(GregorianCalendar.YEAR) + "," + G1.get(GregorianCalendar.MONTH) + "," + G1.get(GregorianCalendar.DAY_OF_MONTH));
        
        // Set the time form Jan 1,1970.
        G1.setTimeInMillis(1);
        System.out.println("Current year, month and day: " + G1.get(GregorianCalendar.YEAR) + "," + G1.get(GregorianCalendar.MONTH) + "," + G1.get(GregorianCalendar.DAY_OF_MONTH));
        
        G1.setTimeInMillis(1234567898765L);
        System.out.println("Current year, month and day: " + G1.get(GregorianCalendar.YEAR) + "," + G1.get(GregorianCalendar.MONTH) + "," + G1.get(GregorianCalendar.DAY_OF_MONTH));
    }
    
}
