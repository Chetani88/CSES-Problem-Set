Time limit: 1.00 s
Memory limit: 512 MB

You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
Input
The only input line contains a string of n characters.
Output
Print one integer: the length of the longest repetition.
Constraints

1 \le n \le 10^6

Example
Input:
ATTCGGGA

Output:
3
  
import java.util.*;

public class Repetations
{
    static int longestSequence(String str)
    {

        if(str.length()==0) return 0;
        int longest=1;
        int count=1;

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }
            else
            {
                count=1;
            }

            longest=Math.max(longest, count);
        }

        return longest;
    }

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        
        String str=sc.next();

        int answer=longestSequence(str);

        System.out.println(answer);

    }

}
