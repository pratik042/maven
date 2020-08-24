package multithreading;
//	QUEST185=JOINING TWO THREADS
public class join1 extends Thread
{
    public void run()
	{
		for (int i=0;i<3;i++)
		{
			System.out.println(i);
			
			try {
				Thread.sleep(1700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
join1 obj1=new join1();
join1 obj2=new join1();
join1 obj3=new join1();
//obj1.start();
obj2.start	();
try 
{
	obj1.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

obj3.start();






}

}
