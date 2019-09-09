import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s =new Scanner(System.in);
        int len = s.nextInt();
        int a[]=new int[len];
        for (int i=0;i<len;i++){
            a[i]=s.nextInt();
        }
      Arrays.sort(a);
        System.out.println(a[len-3]);
    }
}