/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.bluebridgecup1;
import java.util.*;

public class JavaApplicationBlueBridgeCup1 {

    //升序排序数组
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
	int arr[] = new int[n]; //数组初始化，重要！！
        
	for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
	}
	//注意此时只需要比较到n-1即可
        //注意，arr[0]需要和数组中所有的元素进行比较（arr[1],arr[2]...arr[n]),所以需要使用两个index
	//i代表前index, j代表后index:(i+1)
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i]; //large value
                    arr[i] = temp; //small value
                }
            }
	}
											 
	for(int i=0; i<n; i++){
            System.out.print(arr[i]);
            //注意为n-1(started from 0,not 1)
            if(i != n-1)
                System.out.print(" ");
	}
    }
    
}


