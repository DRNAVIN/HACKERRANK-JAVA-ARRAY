import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    public static void main(String[] args) {
            int odd=0;
         Scanner s =new Scanner(System.in);
        int len = s.nextInt();
        int a[]=new int[len];
        for (int i=0;i<len;i++){
            a[i]=s.nextInt();
        }
        for (int i=0;i<len;i++){
            if(a[i]%2!=0){
                
                 System.out.print(a[i]+" ");
            }
           
        }
    
    }
       
    
}