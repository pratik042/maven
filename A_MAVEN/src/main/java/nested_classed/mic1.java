package nested_classed;
///member inner class are the classes inside class but outside method
public class mic1 {
	private int data=23;
	
	class inner{
		void show()
		{
			System.out.println("show="+data);
		}
	}


	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
mic1 obj1=new mic1();
mic1.inner obj2=obj1.new inner();
obj2.show();
	
	
	}

}
