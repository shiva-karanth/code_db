public class Main
{
	public static void main(String[] args) {
	    int[] a={1,2,3,4,5,6};
	    int[] b={1,2,3,4,5};
	    int[] k=reverse(b,0,b.length);
	    for(int i:k)
	    System.out.print(i+"\t");
	}
	static int[] reverse(int[] a,int f,int l)
	{
	    if(f>=l/2)
	    return a;
	    
	    {
	        a[f]=a[f]^a[l-1-f];
	        a[l-1-f]=a[f]^a[l-1-f];
	        a[f]=a[f]^a[l-1-f];
	    }
	    return reverse(a,f+1,l);
	}
}
