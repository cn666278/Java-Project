/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30_nouse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaApplication30_nouse {

 
    public static void main(String[] args) {
            // TODO Auto-generated method stub
            /*
            String s = "第12章第3节";
            Pattern p = Pattern.compile("\\d{1,}");
            Matcher m = p.matcher(s);
            while(m.find()) {
                    System.out.println(m.group());
            }
            */
            int i,j;
            int[][] m1 = new int [3][3];
            for(i=0; i < 3; i++){                             
                for(j=0; j < 3;j++ ){        
                    //System.out.print(Integer.parseInt(gui1.tfMatrixARow1.getText(j, j)));    

                    if(i == 0){
                        
                        String s1 = "1 2 3";
                        int k = s1.indexOf(' ');
                        
                        
                        m1[i][0] = Integer.parseInt(s1.substring(0, k));
                        m1[i][1] = Integer.parseInt(s1.substring(k+1, k+2));
                        m1[i][2] = Integer.parseInt(s1.substring(k+3, k+4));
                            //System.out.println(m1[i][j]);

                        }

                    }
                }
            
            
            /*
            int i,j;
            int[][] m1 = new int [3][3];
            for(i=0; i < 3; i++){                             
                for(j=0; j < 3;j++ ){        
                    //System.out.print(Integer.parseInt(gui1.tfMatrixARow1.getText(j, j)));    

                    if(i == 0){
                        
                        String s1 = "1*2,3";
                        int k = s1.indexOf(' ');
                        //Pattern p = Pattern.compile("\\d{1,}");
                        //Matcher m = p.matcher(s1);
                        while(m.find()) {
                            //k = Integer.parseInt(m.group());
                            //System.out.println(k);
                            //m1[0][0] = k;
                            m1[i][j] = Integer.parseInt(m.group());
                            //System.out.println(m1[i][j]);
                            j++;
                        }
                        //j=0;
                        break;
                    }

                    if(i == 1){
                        String s2 = "7,9";
                        Pattern p = Pattern.compile("\\d{1,}");
                        Matcher m = p.matcher(s2);
                        while(m.find()) {
                            //System.out.println(m.group());
                            j=0;
                            m1[i][j] = Integer.parseInt(m.group());
                            j++;
                        }
                        //j=0;
                        //break;
                    }
                    
                    if(i == 2){
                        String s3 = "8,0";
                        Pattern p = Pattern.compile("\\d{1,}");
                        Matcher m = p.matcher(s3);
                        while(m.find()) {
                            //System.out.println(m.group());
                            j=0;
                            m1[i][j] = Integer.parseInt(m.group());
                            j++;
                        }
                        //j=0;
                        //break;
                    }  
                    
                }

            }
            */
            //for(i=0; i < 3; i++){                             
                for(j=0; j < 3;j++ ){
                    System.out.println(m1[0][j]);
                }
            //}
        }
    }

