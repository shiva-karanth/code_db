import java.util.*;
public class Main
{
	public static void main(String[] args) {
        int x=pow(9,3);
        System.out.println(x);
	}
	static int pow(int b,int p)
	{
	    if(p==0)
	    return 1;
	    return b*pow(b,p-1);
	}
}
