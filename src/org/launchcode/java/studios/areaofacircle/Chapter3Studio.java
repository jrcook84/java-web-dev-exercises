package org.launchcode.java.studios.areaofacircle;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter3Studio {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
       int val=1;
        char[] charactersInString = myString.toCharArray();
    //System.out.println(Arrays.toString(charactersInString));
        for (char character:charactersInString) {
           if (charCount.containsKey(character)){
           charCount.put(character, charCount.get(character) +1);

            }else {
               charCount.put(character, val);


           }
        //get
        }
           System.out.println(charCount);




    }
}
