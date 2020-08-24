package multithreading;
//QUEST184= What if we call directly run method instead of start method
//ANS=As you can see in the above program that there is no context-switching because here t1 and t2 will be treated as normal object not thread object.
public class demo2  extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo2 obj=new demo2();
demo2 obj1=new demo2();
obj.run();
obj.run();
	}

}
