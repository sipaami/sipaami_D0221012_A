import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static int sumOfSubArray(int[] A, int start, int end){
       int sum = 0;
       for(int k=start;k<=end;k++){
           sum += A[k];
       }
       return sum; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]A = new int[n];
        for(int i=0;i<n;i++){
           A[i]= sc.nextInt(); 
        }
        
        int nNegativeSum = 0;
        for(int i=0;i<A.length;i++){//start
            for(int j=i;j<A.length;j++){//end
                int sum = sumOfSubArray(A, i, j);
                if(sum<0){
                    
                    nNegativeSum++;
                    
                }
            
                
            }
        }
    System.out.println(nNegativeSum);
    }
    
}
