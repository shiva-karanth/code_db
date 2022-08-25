import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of people:");
        int n=sc.nextInt();
        System.out.print("Enter the interval:");
        int k=sc.nextInt();
        int saviour=russian_roulette(n,k);
        System.out.println("saviour="+(saviour+1));

	}
	static int russian_roulette(int n,int k)
	{
	    if(n==1)
	    return 0;
	    return (russian_roulette(n-1,k)+k)%n;
	}
}
