
public class Main
{
	public static void main(String[] args) {
	    int a[]={1,3,2,6,4};
	    int n=a.length;
	    System.out.println("bubble sort");
	    System.out.println("before sorting");
	     for(int i=0;i<n;i++)
	    {
	        System.out.print(a[i]+"\t");
	    }
	    for(int i=0;i<n-1;i++)
	    {
	        for(int j=0;j<n-i-1;j++)
	        {
	            if(a[j]>a[j+1])
	            {
	                a[j]=a[j]^a[j+1];
	                a[j+1]=a[j]^a[j+1];
	                a[j]=a[j]^a[j+1];
	               //int temp=a[j];
	               //a[j]=a[j+1];
	               //a[j]=temp;
	            }
	        }
	    }
	    
	    System.out.println("\nafter sorting");
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(a[i]+"\t");
	    }
	}
}
