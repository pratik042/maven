package abstraction1;

import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;

// here we have an abstract class bike which is been extended by 2 class which show its implementaion methods
abstract class car{
	 int i;
	car(int i)
	{
		System.out.println(" im constructor ="+i);//  we ca place a constructor in abstract  class also
	}
	void tyre()//  we can place  method also
	{
		System.out.println(" 4 tyres");
	}
	
	abstract  void  engine();// this is abstract method and its implementation is there in  class fun
	abstract void  per();// this is abstract method and its implementation is there in  class fun
	
}
 class fun extends car{

	 
	 fun(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	void engine(int i)
  {
	  System.out.println(" im from engine fun="+i);
  }
   void per(int i)
   {
	   System.out.println(" good performance="+i);
   }
@Override
void engine() {
	// TODO Auto-generated method stub
	
}
@Override
void per() {
	// TODO Auto-generated method stub
	
}
 }
 class brake extends car{

	 brake(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	void engine(int i){
		 System.out.println(" im from engine brake"+i);
	 }
	  void per(int i){
		  System.out.println(" excellent per="+i);
	  }
	@Override
	void engine() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void per() {
		// TODO Auto-generated method stub
		
	}
 }
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car obj=new brake(33);
obj.engine();
obj.per();
obj.tyre();

car obj1=new  fun(4);
obj1.engine();
obj1.per();
obj1.tyre();






	}

}
