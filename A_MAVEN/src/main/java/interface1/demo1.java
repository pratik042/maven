package interface1;
//interface is used to achieve 100% abstraction
// like abstract class we cannot instantiate this also
// basically used to achieve  multiple inheritance
//interface will have only abstract methods i.e. concrete methods  and class which will implement it will give its implementation
//interface also represents IS-A  relationship
//since java8 we can have default & static methods in interface
//interface provides total abstraction coz all methods present in it are public ,static and final, weather you write it or no

//multiple inheritace is not supported in java but in interface becoz in java,normal class the compiler gets confused which method to call
//that problm is solved here as  implementation of method is given in class which  inherit their concrete/abstract method so compiler dosent get confused


interface A{
void a();//abstract method a
 default void  mm()
 {System.out.println("im from method mm, i need to be default,keep mind calm,keep going");}

   default void cc()
   {
	   System.out.println(" work hard,,sacrifice sleep");
   }
}
interface B{
	void b();
	static void xx()
	{
		System.out.println(" static method isnt getting called");
	}
	
}

public class demo1 implements A,B {
//HERE WE WILL WRITE IMPLEMENTATIN OF METHODS
public void a()
{
	System.out.println("im from a");
}
public void b()
{
	System.out.println("im from b");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B obj=new demo1();//upcasting
        obj.b();//only method b got called
        A obj1=new demo1();//upcasting
        obj1.a();//only method a and cc got called
        obj1.cc();
      
        //B obj3=new B();this is not possible coz we cant instantiate interface
		
        // here we will make object of class demo1,becoz we cant make object of interfaces and abstract classes
		demo1 dd=new demo1();
		dd.a();
		dd.b();
		dd.cc();
		dd.mm();
		
		
		
	}

}
