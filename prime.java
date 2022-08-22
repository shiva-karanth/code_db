import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int flag=0;
	    System.out.print("enter the number: ");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0)
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
	}
}
