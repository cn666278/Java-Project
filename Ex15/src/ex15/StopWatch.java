/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex15;

// import java.util.Date;
// import java.text.SimpleDateFormat;

public class StopWatch {
    private long startTime;
    private long endTime;
    
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    StopWatch(){
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
//        
//        startTime = dateFormat.format(date);
        startTime = System.currentTimeMillis();
    }
    
    void start(){
        startTime = System.currentTimeMillis();
    }
    
    void stop(){
        endTime = System.currentTimeMillis();
    }
    
    long getElapsedTime(){
        stop();
        return endTime - startTime;
    }
}


