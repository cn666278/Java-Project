/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlewithstaticmembers;

public class Circle {
    double radius;
    static int numberOfObjects = 0;
    
    Circle(){
        radius = 1;
        numberOfObjects++;
    }
    
    Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    
    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    
    double getArea(){
        return radius * radius * Math.PI;
    }
    
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    
    void setRadius(double newRadius){
        radius = newRadius;
    }
}