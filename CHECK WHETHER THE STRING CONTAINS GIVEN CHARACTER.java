import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        boolean found=s1.contains(s2);
        if(found){
          System.out.println("True");    
        }
        else{
            System.out.println("False");
        }
    }
      
}