public class Main
{
  public static void main (String[]args)
  {
    int a = add (10, 20);
      System.out.println (a);
    a = sub (30, 20);
      System.out.println (a);
    a = mul (30, 20);
      System.out.println (a);
      
  }
  static int add (int a, int b)
  {
    int s = 0;
    if (b == 0)
      return a;
    return add (b, a - 1) + 1;
  }
  static int sub (int a, int b)
  {
    if (b == 0)
      return a;
      return sub(a - 1, b - 1);
  } 
  
 static int mul(int a,int b)
 {
     
     if(a<b)
     return mul(b,a);
     if(b!=0)
     return a+mul(a,b-1);
     return 0;
 }
}
