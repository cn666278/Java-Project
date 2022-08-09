/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlewithstaticmembers;

public class Rectangle {
    double width = 1;
    double height = 1;
    
    Rectangle(){
    }
    
    Rectangle(double w, double h){
        width = w;
        height = h;
    }
    
    double getArea(){
        return width * height;
    }
    
    double getPerimeter(){
        return width * height * 2;
    }
 }

