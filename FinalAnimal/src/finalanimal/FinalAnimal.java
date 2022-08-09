
package finalanimal;

import java.io.*;
//import java.io.File;
//import java.io.PrintWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 /*
 * @author cn
 */
public class FinalAnimal {

    
    public static abstract class Animal {

        private int age;
        private String name;
        private String color;
        private String type;
        private double weight;
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public abstract void info();
        
    }
    
    
    public interface Flying { 
        public void fly(); 
    } 
        
    public interface predator { 
        public abstract String howToEat(); 
    } 

    public interface prey { 
        public abstract String howToEat(); 
    } 
    
    
    interface mammal { 
        public void breastfeed(); 
    }
    
    interface bird { 
        public void fly(); 
    }    
    
    interface fish { 
        public void swim(); 
    } 
   
    
    public static class Bat extends Animal implements predator, Flying, mammal {      

        @Override 
        public String howToEat() { 
            return "Bat eat mouse.";
        } 
        
        @Override 
        public void fly() { 
            System.out.println("Bat can fly."); 
        } 

        @Override 
        public void breastfeed() { 
            System.out.println("Bat is breastfed."); 
        } 

        @Override
        public void info() {
            System.out.println("\n" + getName() + " belongs to " + getType()+ "\nWeight: " + getWeight() + " kg.");
            System.out.println("Average life expectancy: " + getAge() + " year\ncolor: " + getColor());
            System.out.println(howToEat());
            breastfeed();
            System.out.println();
        }
    } 
    
    public static class Shark extends Animal implements predator, fish {      

        @Override 
        public String howToEat() { 
            return "Shark eat fish.";
        } 
        
        @Override 
        public void swim() { 
            System.out.println("Shark can swim.");  
        } 

        @Override
        public void info() {
            System.out.println("\n" + getName() + " belongs to " + getType()+ "\nWeight: " + getWeight() + " kg.");
            System.out.println("Average life expectancy: " + getAge() + " year\ncolor: " + getColor());
            System.out.println(howToEat());
            swim();
            System.out.println();
        }

    } 
    
    public static class Tiger extends Animal implements predator,mammal {      
        
         @Override 
        public String howToEat() { 
            return "Tiger eat mouse.";
        } 
        
        @Override 
        public void breastfeed() { 
            System.out.println("Tiger is breastfed."); 
        } 
        
        @Override
        public void info() {
            System.out.println("\n" + getName() + " belongs to " + getType()+ "\nWeight: " + getWeight() + " kg.");
            System.out.println("Average life expectancy: " + getAge() + " year\ncolor: " + getColor());
            System.out.println(howToEat());
            breastfeed();
            System.out.println("\n");
        }
    }

    public static class Eagle extends Animal implements predator,Flying, bird {      

        @Override 
        public String howToEat() { 
            return "Eagle eat bat.";
        } 
        
        @Override 
        public void fly() { 
            System.out.println("Eagle can fly.");  
        }  

        @Override
        public void info() {
            System.out.println("\n" + getName() + " belongs to " + getType()+ "\nWeight: " + getWeight() + " kg.");
            System.out.println("Average life expectancy: " + getAge() + " year\ncolor: " + getColor());
            System.out.println(howToEat());
            fly();
            System.out.println();
        }

    } 
    
    public static class Mouse extends Animal implements prey, mammal {      

        @Override 
        public String howToEat() { 
            return "Mouse eat fruit.";
        } 

        @Override
        public void breastfeed() {
            System.out.println("Mouse is breastfed.");
        }
        
        @Override
        public void info() {
            System.out.println("\n" + getName() + " belongs to " + getType()+ "\nWeight: " + getWeight() + " kg.");
            System.out.println("Average life expectancy: " + getAge() + " year\ncolor: " + getColor());
            System.out.println(howToEat());
            breastfeed();
            System.out.println();
        }
    }
    
    public static class Grouper extends Animal implements prey, fish {

        @Override 
        public String howToEat() { 
            return "Grouper eat seaweed.";
        } 

        @Override
        public void swim() {
            System.out.println("Grouper can swim.");
        }
        
        @Override
        public void info() {
            System.out.println("\n" + getName() + " belongs to " + getType()+ "\nWeight: " + getWeight() + " kg.");
            System.out.println("Average life expectancy: " + getAge() + " year\ncolor: " + getColor());
            System.out.println(howToEat());
            swim();
            System.out.println();
        }

    }
 
    //Sort the file
    public static void sort(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuffer sb=new StringBuffer();
            String str;
            while((str = br.readLine())!=null) {
                sb.append(str);
            }
            String source=sb.toString();
            char[] src=source.toCharArray();
            Arrays.sort(src);
            String destination = String.valueOf(src);
            System.out.println(destination);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(destination);
            bw.flush();

            sb.setLength(0);
            sb.append(destination);
            System.out.println(sb.reverse());   //inverse
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    //Replace
    public static void edit(File file) throws FileNotFoundException{
       
        File targetFile;
        targetFile = new File(new String());
        try(
            Scanner input1 =  new Scanner(file);
            PrintWriter output = new PrintWriter(targetFile);
        ){
            while(input1.hasNext()){
                System.out.println("Enter the value you want to replace:");
                String s1 = input1.nextLine();
                String s2 = s1;
                output.println(s2);
            }
        }
    }
    
    //Web crawling 
    public static void crawler(File file){
        
            URL url = null;
            URLConnection urlconn = null;
            BufferedReader br = null;
            PrintWriter pw = null;
            String regex = "https://[\\w+\\.?/?]+\\.[A-Za-z]+"; //url rule
            Pattern p = Pattern.compile(regex);
            try {
                url = new URL("http://gws.ala.org/category/animals");
                urlconn = url.openConnection();
                pw = new PrintWriter(new FileWriter(file), true);
                br = new BufferedReader(new InputStreamReader(
                        urlconn.getInputStream()));
                String buf = null;
                while ((buf = br.readLine()) != null) {
                    Matcher buf_m = p.matcher(buf);
                    while (buf_m.find()) {
                        pw.println(buf_m.group());
                    }
                }
                System.out.println("Web crawling seccess ^_^");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                pw.close();
            }
    }
    
    public static void main(String[] args) throws java.io.IOException{

            Scanner input = new Scanner(System.in);
            int age;
            double weight;
            String choice;
            String color;
            String type;
            List<String> list = new ArrayList<>(); 
            File file = new File("Animal.txt");
            
            Animal animal1 = new Bat();
            Animal animal2 = new Tiger();
            Animal animal3 = new Shark();
            Animal animal4 = new Eagle();
            Animal animal5 = new Mouse();
            Animal animal6 = new Grouper();

            for(int i = 0; i < 5; i++){
                try{
                    System.out.println("Enter the name of animal:(Enter 'quit' for exit)");
                    choice = input.next();
                    if("quit".equals(choice)){
                        break;
                    }  

                    System.out.println("Enter the type of animal(Mammal/Bird/Fish):");
                    type = input.next();
                    
                    System.out.println("Enter the weight of animal(kg):");
                    weight = input.nextDouble();

                    System.out.println("Enter the average age of animal(year):");
                    age = input.nextInt();

                    System.out.println("Enter the color of animal:");
                    color = input.next();

                    switch(choice){
                        case "Bat":
                            animal1.setWeight(weight);
                            animal1.setName(choice);
                            animal1.setColor(color);
                            animal1.setType(type);
                            animal1.setAge(age);
                            animal1.info();
                            break;
                        case "Tiger":
                            animal2.setWeight(weight);
                            animal2.setName(choice);
                            animal2.setColor(color);
                            animal2.setType(type);
                            animal2.setAge(age);
                            animal2.info();
                            break;
                        case "Shark":
                            animal3.setWeight(weight);
                            animal3.setName(choice);
                            animal3.setColor(color);
                            animal3.setType(type);
                            animal3.setAge(age);
                            animal3.info();
                            break;
                        case "Eagle":
                            animal4.setWeight(weight);
                            animal4.setName(choice);
                            animal4.setColor(color);
                            animal4.setType(type);
                            animal4.setAge(age);
                            animal4.info();
                            break;
                        case "Mouse":
                            animal5.setWeight(weight);
                            animal5.setName(choice);
                            animal5.setColor(color);
                            animal5.setType(type);
                            animal5.setAge(age);
                            animal5.info();
                            break;
                        case "Grouper":
                            animal6.setWeight(weight);
                            animal6.setName(choice);
                            animal6.setColor(color);
                            animal6.setType(type);
                            animal6.setAge(age);
                            animal6.info();
                            break;                            
                        default : // default don't need break
                            i=5;
                            System.out.println("Wrong input name of animal,exit.");
                    }

                    try(                        
                        PrintWriter output = new PrintWriter(file); // Create a file
                    ){
                        list.add("Animal:" + choice);
                        list.add("Type:" + type);
                        list.add("Weight:" + weight + " kg");
                        list.add("Color:" + color);
                        list.add("Average life expectancy:" + age + " year");
                        list.add("\n");                        
     
                    }
                }
                
                catch(Exception ex){
                System.out.println("Error input: " + ex.toString() + ",please try again.");
                choice = input.next();
                }
            }
            if(file.exists()){  // Auto close
                        System.out.println("File already exists.");
                        //System.exit(1); 
                    }
                
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                for (int k = 0; k < list.size(); k++) {
                    bw.write(list.get(k));
                    bw.newLine();
                }
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }    
        
        }
        
    }
    
