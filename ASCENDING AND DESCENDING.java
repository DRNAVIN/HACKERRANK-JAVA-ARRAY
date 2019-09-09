import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int a[]= new int[len];
        for(int i=0; i<a.length; i++){
            a[i]=s.nextInt();
        }
        int odd=0,even=0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        if(odd == even){
            for(int i=0; i<a.length; i++){
                System.out.print(a[i]+" ");
            }
        }
        Arrays.sort(a);
         if(odd>even){
           
            for(int i=0; i<a.length; i++){
             System.out.print(a[i]+" ");  
            }
        }
       if(odd<even){
           
            for(int i=len-1; i>=0; i--){
             System.out.print(a[i]+" ");  
            }
        }
    }
}