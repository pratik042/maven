package multithreading;
//QUEST189-WHAT IS DAEMON THREAD,(helper thread)
//ANS-Daemon thread is is a thread which provides services to user thread
//its life depends on mercy of user threads...once user thread is died then JVM automatically terminates daemon thread
//there are many threads running succh as garbage collector thread,finalizer thread
//in simple words it provides services to user thread for background supporting

//java.lang.Thread class provides 2 methods
//1~public void set daemon(boolean status)
//2~public boolean isDaemon()
public class daemon1 extends Thread
{
  public void run()
  {if(Thread.currentThread().isDaemon())
	  System.out.println("given thread is daemon="+Thread.currentThread().isDaemon());
  else {
	  System.out.println(" not daemon,user thread");
  }
  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		daemon1 d1=new daemon1();
		daemon1 d2=new daemon1();
		daemon1 d3=new daemon1();

		d1.setDaemon(true);
		d1.start();
		d2.start();

		d3.start();
		
		
		
		
		
	}

}
