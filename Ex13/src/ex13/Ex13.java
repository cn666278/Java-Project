/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13;

import java.util.Random;

public class Ex13 {

    public static void main(String[] args) {
        // 1000 is the seed,
        // if seed is the same, random output is the same.
        Random rand = new Random(1000);
        
        for(int i = 0; i < 50; i++){
            // 100 is the random range.
            System.out.print(rand.nextInt(100) + " ");
        }
    }
    
}
