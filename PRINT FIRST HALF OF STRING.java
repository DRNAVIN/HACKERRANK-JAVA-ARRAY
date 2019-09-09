import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s1;
        Scanner s=new Scanner(System.in);
        s1=s.nextLine();
        int a=s1.length();
        int b=a/2;
        for(int i=0;i<b;i++){
            System.out.println(s1.charAt(i));
        }
    }
}