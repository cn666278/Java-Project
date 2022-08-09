/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

public class Circle {
    double radius;
    
    Circle(){
        radius = 1;
    }
    
    Circle(double newRadius){
        radius = newRadius;
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

class Tv{
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    
    Tv(){
    }
    
    void turnOn(){
        on = true;
    }
    
    void turnOff(){
        on = false;
    }
    
    void setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }
    
    void setVolume(int newVolumeLevel){
        if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }
    
    void channelUp(){
        if(on && channel < 120)
            channel++;
    }
    
    void channelDown(){
        if(on && channel > 1)
            channel--;
    }
    
    void volumeUp(){
        if(on && volumeLevel < 7)
            volumeLevel++;
    }
    
    void volumeDown(){
        if(on && volumeLevel > 1)
            volumeLevel--;
    }
}
