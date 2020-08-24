package multithreading;
//QUEST186-EXAMPLE OF SETNAME GETNAME,GETID METHOD

public class names1 extends Thread
{
public void run()
{
	System.out.println("im from run");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		names1 obj1=new names1();
		names1 obj2=new names1();
		
		System.out.println(" name of obj1="+obj1.getName());
		System.out.println(" name of obj2="+obj2.getName());
		System.out.println(" id of obj1="+obj1.getId());

	   obj1.setName("pratik ");
	   System.out.println(" name of obj1 after changing="+obj1.getName());
	
	
	}

}
