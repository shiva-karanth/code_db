import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.print("enter the fucking number  (put even number):");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
    
        for(int i=1;i<=N/2;i++)
        {
            for(int j=0;j<(i-1);j++)
            {
               System.out.print(" ");
            }
            System.out.print("*");
            for(int j=-1;j<(N-(2*i));j++)
            {
              System.out.print(" ");
            }
            System.out.println("*");
        }
        
        
        for(int i=N/2;i<=N;i++)
        {
            for(int j=0;j<N/2;j++)
            {
               System.out.print(" ");
            }
            System.out.println("*");
        }
	}
}


