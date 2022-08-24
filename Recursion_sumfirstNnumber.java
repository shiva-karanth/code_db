import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("enter the number to find sum of natural numbers");
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int x=sum(n);
	    System.out.print(x);
	    
	}
	static int sum(int n)
	{
	    if(n==0)
	    {
	        return n;
	    }
	    else
	    {
	        return n+sum(n-1);
	    }
	}
}

