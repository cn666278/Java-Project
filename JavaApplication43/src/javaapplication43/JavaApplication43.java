/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;
import java.util.*;
/**
 *
 * @author cn
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        String s1, s2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个字符串");
        s1 = scanner.next();
        System.out.println("请输入第二个字符串");
        s2 = scanner.nextLine();
        System.out.println("第一个字符串" + s1 + "第二个字符串" + s2);
        System.out.println("第一个字符串" + s1.length()+ "第二个字符串" +s2.length());
        scanner.close();
    }
    
}
