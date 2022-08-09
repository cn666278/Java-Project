/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlewithstaticmembers;

public class CircleWithStaticMembers {

    public static void main(String[] args) {
        System.out.println("Before creating object:");
        System.out.println("The number of Circle object is " + Circle.numberOfObjects);
        
        Circle c1 = new Circle();
        
        System.out.println("\nAfter creating object c1:");
        System.out.println("c1: radius (" + c1.radius + ") and the number of Circle object is (" + c1.numberOfObjects + ")" );
        
        Circle c2 = new Circle(5);
        c1.radius = 9;
        
        System.out.println("\nAfter creating object c2 and modifying c1:");
        System.out.println("c1: radius (" + c1.radius + ") and the number of Circle object is (" + c1.numberOfObjects + ")" );
        System.out.println("c2: radius (" + c2.radius + ") and the number of Circle object is (" + c2.numberOfObjects + ")" );
    
        Rectangle rec1 = new Rectangle(4,40);
        Rectangle rec2 = new Rectangle(3.5,35.9);
        
        System.out.println("\nFirst rectangle:");
        System.out.println("Width:" + rec1.width + "\tHeight:" + rec1.height + "\tArea:" + rec1.getArea() + "\tPerimeter:" + rec1.getPerimeter());
        System.out.println("\nSecond rectangle:");
        System.out.println("Width:" + rec2.width + "\tHeight:" + rec2.height + "\tArea:" + rec2.getArea() + "\tPerimeter:" + rec2.getPerimeter());
        
    }   
    
}
