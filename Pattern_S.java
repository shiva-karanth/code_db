import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    System.out.print ("enter the fucking number  (put even number):");
    Scanner sc = new Scanner (System.in);
    int N = sc.nextInt ();
    for (int i = 1; i <= N; i++)
      {
	if (i == 1 || i == N || i == (N / 2))
	  {
	    for (int j = 0; j < N; j++)
	      {
		System.out.print ("*");
	      }
	    System.out.println ();
	
	  }
	if (i < (N / 2)&&i!=0)
	  {
	    System.out.println ("*");
	  }
	if (i > (N / 2)&&i!=N)
	  {
	    for (int j = 1; j < N; j++)
	      {
		System.out.print (" ");
	      }
	    System.out.println ("*");
	  }

      }
  }
}

