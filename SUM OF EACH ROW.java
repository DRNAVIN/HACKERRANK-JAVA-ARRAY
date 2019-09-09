import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s= new Scanner(System.in);
        int len;
        int sum=0;
        len=s.nextInt();
        int a[][]=new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                a[i][j]=s.nextInt();
                    sum=sum+a[i][j];
    
            }
            System.out.println(sum);
            sum=0;
        }
    }
}