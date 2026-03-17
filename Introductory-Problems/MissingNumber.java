// You are given all numbers between 1,2,.......,n except one. Your task is to find the missing number.
import java.util.*;

public class MissingNumber 
{
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();

       long nums[]=new long[(int) n];

        // Taking Input;

        for(int i=0;i<n-1;i++)
        {
            nums[i]=sc.nextLong();
        }

        long sum1=n*(n+1)/2;

        long sum2=0;

        for(int i=0;i<n-1;i++)
        {
            sum2+=nums[i];
        }

       long Missing=sum1-sum2;

        System.out.println(Missing);
    }
}
