package benford;

import java.io.*;
import java.util.*;

public class Benford 
{
      public static void main(String[] args) throws Exception
      {
           Scanner input = new Scanner(new File("C:\\Users\\BeenJamin124\\Documents\\NetBeansProjects\\Benford\\src\\benford\\input.txt"));
           int cases = input.nextInt();

           for(int a = 0; a < cases; a++)
           {
                int tests = input.nextInt();
                int array[] = new int[tests];
                int x = 0;
                
                for(int b = 0; b < tests; b++)
                {
                     array[b] = input.nextInt();                     
                }
                
                for(int c= 0; c < array.length; c++)
                {
                    if(array[c] > 9 && array[c] < 20 ||  array[c] > 99 && array[c] < 200 || array[c] > 999 && array[c] < 2000 || array[c] == 10000) 
                    {
                        x++;
                    } 
                }
                
                double calc = (double) x/tests;
                double percentage = (double)calc*100;
                if(percentage>= 25 && percentage <= 35)
                {
                    System.out.println("PASSED");
                }
                else
                {
                    System.out.println("FAILED: " + percentage + "%");
                }
           }
      }    
}
