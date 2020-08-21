package nested_classed;
//local inner classes is  class inside method
//KEEP IN MIND
//)1) Local inner class cannot be invoked from outside the method.
//2) Local inner class cannot access non-final local variable till JDK 1.7. Since JDK 1.8, it is possible to access the non-final local variable in local inner class.
public class lic1 {
	
private int data=30;	//we made a private instance variable data outside method
void display()// method display is present  inside main class 
{
	
	class inner //here we made class inner inside display
      {
		void show()//here we made show method inside inner class
		{
	      System.out.println("data="+data);		//we accssed data inside method
		}
  	  }
      inner obj2=new inner();//wee created instance from method we cannot invoke it from outside method
      obj2.show();
           
}//display method ends here
	public static void main(String[] args) 
	{
lic1 obj1=new lic1();//we instantiated obj for class lic1
obj1.display();// we called method displayy
	}

}
