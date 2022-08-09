/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

public class CircleAndTvApplication {

    public static void main(String[] args) {
        // TODO code application logic here
        Circle crc1 = new Circle();
        double area1 = crc1.getArea();
        
        Circle crc2 = new Circle(2);
        double area2 = crc2.getArea();
        
        Circle crc3 = new Circle(5);
        double area3 = crc3.getArea();
        
        System.out.println("The area is "+ area1 + " & " + area2 + " & " + area3);
        
        Tv tv1 = new Tv();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        System.out.println("Tv1's channel is "+ tv1.channel);
        System.out.println("Tv1's volume is "+ tv1.volumeLevel);
    }
    
}
