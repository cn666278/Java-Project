/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11_selectionsort;

public class JavaApplication11_SelectionSort {
    /** The method for sorting the number */
    public static void selectionSort(double[] list){
        for(int i = 0; i < list.length - 1; i++ ){
            // Find the minimum in the list[i..list.length-1]
            double min = list[i];
            int minIndex = i;
            for(int j = i + 1; j < list.length; j++){
                if(min > list[j]){
                    min = list[j];
                    minIndex = j;
                }
            }
            // Swap list[i] with list[minIndex] if necessary
            // list[i] is the first one in unsorted list
            if(minIndex != i){
                list[minIndex] = list[i];
                list[i] = min;
            }  
        }     
    }
    
    public static void main(String[] args) {
        double[] list = {1, 9.2, 4.5, 7.1, -3, 0};
        System.out.println("list = { 1, 9.2, 4.5, 7.1, -3, 0 }");
        selectionSort(list);
        System.out.print("------After selectionSort-------\nlist = { ");
        for (double i : list) {
            System.out.print(i + " ");
        }
        System.out.println("}");
        
    }
    
}
