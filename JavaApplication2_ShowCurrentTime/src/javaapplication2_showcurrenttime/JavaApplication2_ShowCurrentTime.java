/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2_showcurrenttime;

public class JavaApplication2_ShowCurrentTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours %60;
        
        System.out.println("Current time is " + (currentHour+8) + ":"+ currentMinute + ":" + currentSecond + " CST (GMT+8)");
        System.out.println((9.0 / 5.0)  * 37.7778 +  32);
    }
    
}
