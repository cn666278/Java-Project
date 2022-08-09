/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author cn
 */
import java.util.Scanner;
public class JavaApplication28 {

    public static void main(String[] args) {
        int N = 6;
        int[] a = new int[N];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < N; i++)
            a[i] = input.nextInt();
        for (int i = 1; i < N; i++)
            if (a[i-1] < a[i])
            {
                int t = a[i];
                a[i] = a[i-1];
                a[i-1] = t;
            }
        for (int i = 0; i < N; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}
    

