
public class Main
{
	public static void main(String[] args) {
	   String basic methods
	   boolean x=true;
	   String s=String.valueOf(x);
	    
	   System.out.println(s);
	      System.out.println(String.toUpperCase(s));
	      System.out.println(String.toLowerCase(s));
	   
	   //String Buffer (Part 1)
	   StringBuffer strBuff = new StringBuffer("Hello world");
	   System.out.println(strBuff);
	   System.out.println(strBuff.length());//length =11
	   System.out.println(strBuff.capacity());//capacity=length+16 
	   System.out.println(strBuff.charAt(1));//returns for e
	   strBuff.setCharAt(0,'B');//sets the value B at 0th positon
	   System.out.println(strBuff);//returns Bello world
	   strBuff.setLength(2);
	   System.out.println(strBuff);//returns Be
	   strBuff.append("lla Ciao;");
	   System.out.println(strBuff);//returns bella Ciao;
	   strBuff.insert(0,"O ");
	   System.out.println(strBuff);//returns  O bella Ciao;
	   
	   //String Buffer (Part 2)
	   StringBuffer name =new StringBuffer("Harry Kane");
	   name.reverse();
	   System.out.println(name);    //returns enaK yrraH
	   name.reverse();              //reversed again ;)
	   name.delete(1,5);
	   System.out.println(name);    //returns H Kane
	   name.deleteCharAt(0);
	   name.deleteCharAt(0);
	   System.out.println(name);    //returns Kane
	}
}

