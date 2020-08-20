package nested_classed;
//class inside class is called inner class
public class inner1 {
int i=2;


	class p{
	void show()
	{
		System.out.println("im from show="+i);
	}

	 
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inner1 obj1=new inner1();
	//	p obj2=new p();
	inner1.p obj2=obj1.new p();	
		obj2.show();
	}

}
