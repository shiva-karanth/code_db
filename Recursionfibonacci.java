import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
        System.out.print("enter the nth number:");
        int x=sc.nextInt();
        int y=fib(x);
        int z=fib(x);
        System.out.println(y);
        System.out.println(z);
	}
	static int fib(int a)
    {
        if(a==1)
        {
            return 0;
        }
        if(a==2)
        {
            return 1;
        }
        return fib(a-2)+fib(a-1);
        // 0 1 1 2 3 5 8 13 21
        // fib(6)=fib(5)+fib(4)
    }
    static int fiba(int a)
    {
        int x=0,y=1;
         if(a==1)
        {
            return 0;
        }
        else if(a==2)
        {
            return 1;
        }
        else
        {
           for(int i=3;i<=a;i++)
           {
               int temp=x+y;
               x=y;
               y=temp;
           }
        }
        return y;
    }
    
}
