
package javaapplication18_point2d;

import java.util.Scanner;
import javafx.geometry.Point2D;
import java.util.Date;
public class JavaApplication18_Point2D {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter point1's x-,y-coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter point2's x-,y-coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        Point2D p1 = new Point2D(x1,y1);
        Point2D p2 = new Point2D(x2,y2);
        System.out.println("The distance between p1 and p2 is: " + p1.distance(p2));
        System.out.println("The midpoint between p1 and p2 is: " + p1.midpoint(p2).toString());
        
        Date date = new Date();
        System.out.println("The elapsed time since Jan 1,1970 is: " + date.getTime() + " milliseconds");
        System.out.println(date.toString());
    }
    
}
