import java.util.*;
public class Main
{

  static int MAX_VALUE = 1000005;
  public static void main (String[]args)
  {

    System.out.print ("enter the number hehe:");
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int x = 0, val = -1;
      boolean[] b = S (MAX_VALUE);
    for (int i = 1; i < MAX_VALUE; i++)
      {
	if (b[i] == true)
	  {
	    x++;
	    if (x == n)
	      {
		val = i;
	      }
	  }
	else
	  {
	    continue;
	  }
      }

    System.out.println (n + "th prime is " + val);



  }
  public static boolean[] S (int n)
  {
    boolean isPrime[] = new boolean[n + 1];
    Arrays.fill (isPrime, true);
    isPrime[0] = false;
    isPrime[1] = false;
    for (int i = 2; i * i < n; i++)
      {
	for (int j = 2 * i; j <= n; j += i)
	  {
	    isPrime[j] = false;
	  }
      }
    return isPrime;
  }
}

