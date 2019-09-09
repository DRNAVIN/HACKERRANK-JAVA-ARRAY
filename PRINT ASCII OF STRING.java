import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s1;
        Scanner s= new Scanner(System.in);
        s1=s.nextLine();
        
        for (int i=0;i<s1.length();i++)
        {
            int a=(int) s1.charAt(i);
            System.out.println(a);
        }
    }
}