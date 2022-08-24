
public class Main
{
	public static void main(String[] args) {
        int s=sum(100,20);
        System.out.println(s);
	}
	static int sum(int a,int b)
	{
	  int s=0;
	  if(a==0)
	  {
	      return b;
	  }
	  s=sum(b,a-1)+1;
	  return s;
	}

}
