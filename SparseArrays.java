import java.io.*;
import java.util.*;

public class SparseArrays 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int tot_str = sc.nextInt();      // to get total number of strings
        String[] words = new String[tot_str]; 
        for(int i=0;i<tot_str;i++)
        {
            words[i] = sc.next();
        }
        int test = sc.nextInt();       
        for(int i=0;i<test;i++)
        {   int count = 0;
            String check = sc.next();
            for(int j=0;j<tot_str;j++)
            {
                if(check.equals(words[j]))
                {
                   count++;
                }
            }
            System.out.println(count);
        }
    }
}
