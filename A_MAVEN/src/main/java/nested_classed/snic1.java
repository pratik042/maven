package nested_classed;
//SNIC= STATIC NESTED INNER CLASS
//the class inside main class is static and it can access only static data members and private datamembers 

//In this example, you need to create the instance of static nested class(inner) because it has instance method msg().
//But you don't need to create the object of Outer class (snic1) because nested class is static
//and static properties, methods or classes can be accessed without object.


public class snic1 
{
private static  int data=42;//here we made a static int data
static class inner//here we made a class static
{
     void show()
	{
		System.out.println("im from show="+data);//static data is accesssd here it access private as well as non private
	}
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
snic1.inner obj=new snic1.inner();
obj.show();
	}

}
