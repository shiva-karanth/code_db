import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the number  :");
	    int i=1;
	    int x=sc.nextInt();
	    print(x,i);
	    System.out.println();
	    printB(x);
	}
	static void print(int x,int i){
	    if(x==0)
	    return;
	    System.out.print(i+"\t");
	    print(x-1,i+1);
	}
		static void printB(int x){
	    if(x==0)
	    return;
	    System.out.print(x+"\t");
	    printB(x-1);
	    
	}
	
}
