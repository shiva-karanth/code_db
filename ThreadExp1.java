class hi extends Thread{
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
class hello extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {System.out.println("Hello");
        try{
        Thread.sleep(200);
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
            obj1.start();
            obj2.start();
	}
}

// Thread.sleep(x) waits for x miliseconds
// Run is internal method of thread
// to call run method we must use start method in main
// every class should be extended with class thread

