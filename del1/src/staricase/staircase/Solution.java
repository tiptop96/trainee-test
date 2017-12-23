package staircase;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    static int[] defaultcase = new int[] {1,2,4};
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(recursion(n));
        }
    }
    
    //This method is repeated for every option within itself until we reach our basecase.
    public static int recursion(int n) {
        if (n < 4) //Basecase. No further recurrison neccessary.
            return defaultcase[n-1];
        else
            return recursion(n-1) + recursion(n-2) + recursion(n-3); //Add return values from all options if we took 1-3 steps.
    }
}
