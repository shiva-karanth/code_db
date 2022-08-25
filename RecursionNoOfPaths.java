import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   // number of paths in Matrix from first to end
	   System.out.print("enter the number of rows and colomns   :");
	   Scanner sc=new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
	   int r=paths(x,y);
	   System.out.println(r);
	}
	static int paths(int x,int y)
	{
	    if(x==1||y==1)
	    return 1;
	    return paths(x-1,y)+paths(x,y-1);
	}
}
