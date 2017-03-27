/*You are given a list of size N , initialized with zeroes. 
You have to perform  operations on the list and 
output the maximum of final values of all the  elements in the list. 
For every operation, you are given three integers and you have to add value to all the elements ranging from index p to q(both inclusive).

Input Format

First line will contain two integers N and M separated by a single space.
Next  lines will contain three integers p ,q  and  sum separated by a single space.
Numbers in list are numbered from 1  to N .

Output Format 
One line containing max value in updated list
*/
import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long max = 0L,sum = 0L;
        long operations = sc.nextLong();
        long[] arr = new long[size + 1];
        for(long i=0;i<operations;i++)
        {
            int low_end = sc.nextInt();
            int high_end = sc.nextInt();
            long add = sc.nextLong();
    
            arr[low_end] += add;  // only successive elements difference is stored
            if(high_end + 1 <= size)
            arr[high_end + 1] -= add;  // the next to value to high_end is smaller than the previous value by "add" value
        } 
       for(int x=0;x<=size;x++)
           {
           sum += arr[x];
           if(max < sum ) // considering only positive differences
               max = sum;
           }
       System.out.println(max);
    }
}
