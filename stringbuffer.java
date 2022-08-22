// string buffer stuffs
public class Main
{
  public static void main (String[]args)
  {
    StringBuffer sbf1 = new StringBuffer ("hi");
    StringBuffer sbf2 = new StringBuffer ("hi");

      System.out.println (sbf1.capacity ());

    if (sbf1 == sbf2)
      {
	System.out.println ("== true");
      }
    else
      {
	System.out.println ("== false");
      }

    if (sbf1.equals (sbf2))
      {
	System.out.println ("== true");
      }
    else
      {
	System.out.println ("== false");
      }
  }
}

