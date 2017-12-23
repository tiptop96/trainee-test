package fullcount;
import java.io.*;
import java.util.*;

public class Solution {

	 private static String[] sort(String[] arr) {
	        
	        int n = arr.length;
	        int count[] = new int[256];
	        String[] output = new String[n];
	        //Take the number of the first half of the "array" and add a ' -' to it replacing the old contents.
	        for (int i = 0; i < n/2; i++){
	            arr[i] = arr[i].toCharArray()[0] + " -";
	        }
	        //Populate the array
	        for (int i=0; i<256; i++)
	            count[i] = 0;
	        //Start at the top of the inputed array and add 1 to the index of the count array represented by the numerical value of the first letter of each indexs value in the array
	        for (int i=n-1; i>=0; i--)
	            count[arr[i].toCharArray()[0]]++;
	        //Add the previous index to the current.
	        for (int i=1; i<256; i++)
	            count[i] += count[i-1];
	        
	        for (int i = n-1; i>=0; i--)
	        {
	        	//Find index of count array by numerical value of first char in string and subtract by one
	        	//Use value at this index to represent index of output to set to new formatted string
	            output[count[arr[i].toCharArray()[0]]-1] = arr[i].substring(2,arr[i].length());
	            //Subtract all values by one. Reason for this is above my head. But else all will be null.
	            count[arr[i].toCharArray()[0]]--;
	        }
	        
	        return output;

	    }
	    
	    public static void main(String[] args) {
	    	//Setup
	        Scanner in = new Scanner(System.in);
	        List<String> list = new ArrayList<String>();
	        String[] finalOut;
	        //Get all the text
	        int count = Integer.parseInt(in.nextLine());
	        for(int i = 0; i < count; i++) {
	            list.add(in.nextLine());
	        }
	        //Conevrt to array and sort
	        String[] array = list.toArray(new String[0]);
	        finalOut = Solution.sort(array);
	        //Print and add a space for correct separation.
	        for (String s : finalOut) {
	            System.out.print(s);
	            System.out.print(" ");
	        }
	    }
}