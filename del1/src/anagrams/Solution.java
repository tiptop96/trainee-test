package anagrams;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int makingAnagrams(String s1, String s2){
        s1 = s1.toLowerCase(); //Make sure we are working with all lowercase letters.
        s2 = s2.toLowerCase(); //Upper and lower case letter do not have the same numerical values.
        char[] s1Chars = s1.toCharArray(); 
        char[] s2Chars = s2.toCharArray();
        int count = 0; //Will store our result 
        int[] chars = new int[256]; //26 if only english alphabet english chars.        
        
        for(int i = 0; i < s1Chars.length; i++){
            if (allowed(s1Chars[i])) //Check if the char is allowed (curr always true)
                chars[s1Chars[i]]++; //loop trough first string and take its numerical value to get the index to add to in the array "chars".
            else
                throw new IllegalArgumentException();
        }
        for(int i = 0; i < s2Chars.length; i++){
        	//Above we add points to the index in the "chars" that corresponds to our chars numerical value.
        	//Here we subtract. This means if a char exists in both strings they neutralize eachother (aka noting to subtract).
        	//This leaves us with "points" in "chars" for only odd letters. Letters to remove.
            if (allowed(s2Chars[i]))
                chars[s2Chars[i]]--; //If we are only using a-z this needs to be subtraced by 97 manipulate the right spot in chars array.
            else
                throw new IllegalArgumentException();
        }
        for (int i = 0; i < chars.length; i++) {
            count += Math.abs(chars[i]); //Add "points" for odd chars regardless of if they are positive values or not.
        }
        return count; 
    }
    
    public static boolean allowed(char c) {
        return true; //(c >= 97 && c <= 122);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}

