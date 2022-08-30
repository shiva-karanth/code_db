// class hi implements Runnable{
// public void run()
// {
//     for(int i=0;i<5;i++)
//     {
//         System.out.println("hi");
//         try{ Thread.sleep(100);} catch(Exception e) {};
//     }
// }}
// class hello implements Runnable{
// public void run()
// {
//     for(int i=0;i<5;i++)
//     {
//         System.out.println("hello");
//         try{ Thread.sleep(1000);} catch(Exception e) {};
//     }
// }}
// public class Main
// {
//      public static void main(String[] args) 
//      {
//          hi obj1=new hi();
//          hello obj2=new hello();

//          Thread t1=new Thread(obj1);
//          Thread t2=new Thread(obj2);

//          t1.start();
//          t2.start();
//      }
// }

// down

// public class Main
// {
//   public static void main (String[]args)
//   {
      
//     Runnable obj1=new Runnable()
//     {
//         public void run ()
//         {
//           for (int i = 0; i < 5; i++)
//         	{
//         	  System.out.println ("hi");
//         	  try{Thread.sleep (1000);} catch (Exception e){};
//         	}
//         }
//     };
//     Runnable obj2 = new Runnable ()
//     {
//         public void run ()
//         {
//           for (int i = 0; i < 5; i++)
//         	{
//         	  System.out.println ("hELLO");
//         	  try{Thread.sleep (700);} catch (Exception e){};
//         	}
//         }   
//     };

//     Thread t1 = new Thread (obj1);
//     Thread t2 = new Thread (obj2);

//     t1.start ();
//     t2.start ();
//   }
// }

// down

// public class Main
// {
//   public static void main (String[]args)
//   {
      
//     Runnable obj1=()->
//         {
//           for (int i = 0; i < 5; i++)
//         	{
//         	  System.out.println ("hi");
//         	  try{Thread.sleep (1000);} catch (Exception e){};
//         	}
//         };
    
//     Runnable obj2 =()->
//         {
//           for (int i = 0; i < 5; i++)
//         	{
//         	  System.out.println ("hELLO");
//         	  try{Thread.sleep (700);} catch (Exception e){};
//         	}
//         };

//     Thread t1 = new Thread (obj1);
//     Thread t2 = new Thread (obj2);

//     t1.start ();
//     t2.start ();
//   }
// }


// down

public class Main
{
  public static void main (String[]args)
  {
    Thread t1 = new Thread(()->
        {
          for (int i = 0; i < 5; i++)
        	{
        	  System.out.println ("hi");
        	  try{Thread.sleep (1000);} catch (Exception e){};
        	}
        });
    Thread t2 = new Thread(()->
        {
          for (int i = 0; i < 5; i++)
        	{
        	  System.out.println ("hELLO");
        	  try{Thread.sleep (700);} catch (Exception e){};
        	}
        });
    t1.start ();
    t2.start ();
  }
}
