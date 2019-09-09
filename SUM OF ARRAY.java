import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner s =new Scanner(System.in);
        int len = s.nextInt();
        int a[]=new int[100];
        for (int i=0;i<len;i++){
            a[i]=s.nextInt();
        }
        int sum=0;
        for (int i=0;i<len;i++){
            sum=sum+a[i];
            }
        System.out.println(sum);
      
    }
}