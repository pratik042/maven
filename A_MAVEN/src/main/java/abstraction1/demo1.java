package abstraction1;
// java class which is declared with   declared with abstract key word is called abstract class
//any abstract class can have abstract or non abstract method
//class which will inherit abstract class will provide implementation of  abstract methods
//the method which are present in abstract class are already static,and final whether you  write them or dont dosent care,compiler will make them public static and final
// abstract class cannot be instantiated.

abstract class bike{
	
	abstract void run();
	
}

public class demo1 extends bike{

	void run()
	{
		System.out.println(" him im from run");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bike obj= new demo1();
		obj.run();
		
		
	}

}
