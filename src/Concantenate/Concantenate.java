package Concantenate;

import java.util.Arrays;
  
public class Concantenate {
    public static void main(String[] args)
    {
        // first array
        int[] a = { 0, 1, 2, 3, 4 };
  
        // second array
        int[] b = { 5, 6, 7, 8, 9 };
  
        // determines length of firstArray
        int a1 = a.length;
        
        // determines length of secondArray
        int b1 = b.length;
        
        // resultant array size
        int c1 = a1 + b1;
  
        // create the resultant array
        int[] c = new int[c1];
  
        // using the pre-defined function arraycopy
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
  
        // prints the resultant array
        System.out.println(Arrays.toString(c));
    }
}

