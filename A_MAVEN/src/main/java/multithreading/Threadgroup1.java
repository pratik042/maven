package multithreading;
//QUEST191~EXPLAIN THREAD GROUP
//ANS~Thread group is set of threads or collection of threads,it can include other thread group
//          It can access the info about its own thread group but cant access the access of other thread group
//   Thread group class is implemented from java.lang.ThreadGroup package.
//  or Thread group class is implemented from Runnable Interface .

//It provides two constructors,and lot of methods
//1)ThreadGroup(String name)
//2)ThreadGroup(ThreadGroup parent,String name)

public class Threadgroup1 implements Runnable
{

	public static void main(String[] args) 
	{
	
    ThreadGroup obj2=new ThreadGroup("parent group");//we made parent thread  group

    Thread t1=new Thread(obj2,null,"thread1");//made thread t1
	t1.start();
	Thread t2=new Thread(obj2,null,"thread2");//made thread t2
	t2.start();
	Thread t3=new Thread(obj2,null,"thread3");//made thread t3
    t3.start();
    
    System.out.println(" threadgroup name="+obj2.getName());
        obj2.list();
	
	}

	@Override
	public void run() {
	System.out.println("this metthod came automatic after implementing runnable interface");
		
	}

}
