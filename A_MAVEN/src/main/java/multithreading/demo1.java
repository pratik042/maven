package multithreading;
//For making thread class we need to extend the current class with Thread class. or by implementing runnable interface.
//Thread class provides some methods and constructors

public class demo1 extends Thread
{
	public void run()//we used run method, we can use start also
	{
		System.out.println(" im from run,thread is running");
	}
//	public void start()//here i used start method
//	{
//		System.out.println("im from start");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo1 obj=new demo1();
obj.start();
//obj.run();


	}

}
