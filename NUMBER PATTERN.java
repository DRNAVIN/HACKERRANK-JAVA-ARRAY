import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int a[][]=new int[r][c];
        for(int i=1;i<=r;i++){
            
            for(int j=i;j<=(c+i)-1;j++){
                
                
                System.out.print(j+" ");
            }
            System.out.println("");
            
        }
    }
}