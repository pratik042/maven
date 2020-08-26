package multithreading;
//Quest192~WHAT IS SHUT DOWN HOOK
//ANS~It is used to perform task such as closing log file,sending some imp alerts etc.when jvm shut down normally

//addShutDown Hook() method of Runtime class is used to register the thread with virtual Machine
//obj of Runtime class can be obtained by calling the static factory method of get runtime
//static factory method returns instance of runtime class

//Every Java application has a single instance of class Runtime that allows the application to interface withthe environment in which the
//application is running. The currentruntime can be obtained from the getRuntime method. 
//An application cannot create its own instance of this class

class demo extends Thread
{    public void run()// we made run method as we extended Thread class,even if we implement runnable class still we need to make run method
	{
	System.out.println(" shutdownhook msg= u have looged off from everything");
	}
	
}
public class shutdown_hook 
{
	public static void main(String[] args) 
	{
	Runtime r=Runtime.getRuntime();//we used runtime class to get addShutDownHook() method
	r.addShutdownHook(new demo());

	System.out.println("main sleeping..after some time shut down msg will popup");
	
	try {
		Thread.sleep(1700);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
