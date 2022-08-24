
public class Main
{
	public static void main(String[] args) {
	    int[] a={1,2,3,4,5,6};
	    int[] b={1,2,3,4,5};
	    int[] k=reverse(b);
	    for(int i:k)
	    System.out.print(i+"\t");
	}
	static int[] reverse(int[] a)
	{
	    int n=a.length;
	    for(int i=0;i<n/2;i++)
	    {
	        a[i]=a[i]^a[n-1-i];
	        a[n-1-i]=a[i]^a[n-1-i];
	        a[i]=a[i]^a[n-1-i];
	    }
	    return a;
	}
}
