import java.util.*;
import java.io.*;
class Ques_4_easy
{
 public static void main()
 {
     Scanner sc=new Scanner(System.in);
     int n,a,b;
     String k;
     char ch,ch1;
     System.out.println("Enter a number for number of times you want to input words");
     n=sc.nextInt();
     for(int i=0;i<n;i++)
     {
         k=sc.next();
         a=k.length();
         if(a>10)
         {
         b=a-2;
         
         ch=k.charAt(0);
         ch1=k.charAt(a-1);
         System.out.println(ch+""+b+""+ch1);
     }
     else
     System.out.println(k);
    }
     
}
}