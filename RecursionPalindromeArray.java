
public class Main
{
	public static void main(String[] args) {
	    int[] b={1,2,3,2,1};
	    boolean k=pali(b,0,b.length);
	    if(k)
	    {System.out.println("Palindrome");}
	    else
	    {
	        System.out.println("not palindrome");
	    }
	    
	}
	static boolean pali(int[] a,int f,int l)
	{
	    if(f>=l/2)
	    return true;
	    if(a[f]==a[l-f-1])
	    {
	        return pali(a,f+1,l);
	    }
	    else
	    return false;
	}
}
