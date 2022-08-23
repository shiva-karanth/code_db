import java.util.Scanner;
public class Main
{
    static int x=0;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("Enter the number of recursion    :");
		int f=sc.nextInt();
		add(f);
	}
	static int add(int a)
	{
	    
	    if(a==0)
	    return 0;
	     System.out.println("Hi\t"+(++x));
	    add(a-1);
	    return 0;
	}
}

