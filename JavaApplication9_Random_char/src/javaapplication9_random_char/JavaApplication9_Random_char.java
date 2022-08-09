/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9_random_char;
//Class RandomCharacter cannot be public
class RandomCharacter{
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 +1));        
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a', 'z');        
    }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');         
    }
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0', '9');         
    }
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000', '\uFFFF');         
    }
}
public class JavaApplication9_Random_char {

    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;
        
        for(int i = 0; i < NUMBER_OF_CHARS; i++){
            char ch = RandomCharacter.getRandomLowerCaseLetter();
            if((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);   //print not next line  
        }
    }
    
}
