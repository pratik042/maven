package multithreading;
//quest188-//EXPLAIN PRIORITIES OF THREAD
// here we will set priorities to threads

public class priority_thread1 extends Thread
{ 
	public void run()
	{
		System.out.println("running thread="+Thread.currentThread().getName());//simply getting details
		System.out.println("thread priority="+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		priority_thread1 p1=new priority_thread1();//making thread
		priority_thread1 p2=new priority_thread1();
		priority_thread1 p3=new priority_thread1();
		
		p1.setPriority(MIN_PRIORITY);
		p2.setPriority(NORM_PRIORITY);
        p3.setPriority(MAX_PRIORITY);
        
//		System.out.println(p1.getPriority());//default priority is zero
//		System.out.println(p2.getPriority());//default priority is 5
//		System.out.println(p3.getPriority());//default priority is 10
		
		p1.start();
		p2.start();
		p3.start();
		
		
		
	}

}
