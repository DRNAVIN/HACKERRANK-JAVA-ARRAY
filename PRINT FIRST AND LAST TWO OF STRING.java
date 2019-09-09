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
        int k=s1.length();
        for(int i=0;i<2;i++){
            System.out.print(s1.charAt(i));
        }
        for (int j=k-2;j<=k-1;j++){
            System.out.print(s1.charAt(j));
        }
        
    }
}