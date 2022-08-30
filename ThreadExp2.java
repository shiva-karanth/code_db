class hi implements Runnable{
    public void run(){
        
        for(int i=0;i<5;i++)
        {System.out.println("Hi");
        try{
        Thread.sleep(500);
        }
        catch(Exception e)
        {
            
        }}
            
        }
     
}
class hello implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
        {System.out.println("Hello");
        try{
        Thread.sleep(1000);
        }
        catch(Exception e)
        {
            
        }}
            
    }
    
}
public class Main
{
	public static void main(String[] args) {
            hi obj1=new hi();
            hello obj2=new hello();
            // Runnable obj1=new hi();              //downcasting since it got implemented by Runnable Class
            // Runnable obj2=new hello();           //downcasting since it got implemented by Runnable Class
            
            Thread t1=new Thread(obj1);
            Thread t2=new Thread(obj2);
            t1.start();
            t2.start();
	}
}


// here we implimented Runnable interface instead of Thread class to avoid multiple inheritance
// here we need to create the object of class
// and we need to create the Thread object where we pass object

