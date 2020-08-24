package multithreading;
//here we can see we cant  call start method with run
//but cant call run method with start
public class sleep1 extends Thread
{
public void run()
{
	System.out.println("im from start");
	for(int i=0;i<5;i++)
	{try {
		System.out.println(i);
		Thread.sleep(800);
	//	System.out.print();
	}
	catch(InterruptedException e)
	{
		System.out.println(" intrupted exption ho gya reeee=="+e);
	}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sleep1 obj=new sleep1();
sleep1 obj1=new sleep1();
obj.start();
obj1.start();
//obj.run();
	}

}
