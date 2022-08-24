import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.print("enter the number to find Factorial=");
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int x=fact(n);
	    System.out.print(n+"!="+x);
	    
	}
	static int fact(int n)
	{
	    if(n==0)
	    {
	        return 1;
	    }
	    if(n==1)
	    {
	        return n;
	    }
	    else
	    {
	        return n*fact(n-1);
	    }
	}
}

