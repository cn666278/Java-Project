/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex15;

public class Ex15 {

 public static void main(String[] args) {
        double[] a = new double[100000];
        for(int i = 0; i < a.length; i++){
            a[i] = Math.random() * 100000;
        }
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        
        /** The method for sorting the number */
        for(int i = 0; i < a.length - 1; i++){
            // Find the minimum in the list[i..list.length-1]
            double currentMin = a[i];
            int currentMinIndex = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < currentMin){
                    currentMin = a[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary
            // list[i] is the first one in unsorted list
            if(currentMinIndex != i){
                a[currentMinIndex] = a[i];
                a[i] = currentMin;
            }
        }
        
        stopwatch.stop();
        System.out.println(stopwatch.getElapsedTime());

    }
}