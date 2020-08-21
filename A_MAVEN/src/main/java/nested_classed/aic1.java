package nested_classed;
//anonymous inner class are those class which have no name,it must be used if you want to override  method or class of interrface
interface eatable//here we made interface eatable
{
	void show1();//its concerte method is given here
}
abstract class demo//here we madee an abstract class , so we will make an abstract method in it
{
	abstract void show();//we made an abstract  concrete method
}
public class aic1 
{
	public static void main(String[] args)
     {
		demo obj=new demo()//see where we made instance for show
{
	void show()//here its not needed that method should be public
	{
		System.out.println("im from show");
	}
};
obj.show();//here we called show method
//==========================================================================================
eatable obj1=new eatable()//here we made instance show1
{
	public 	 void show1()//make sure this method is public,coz this method is of interface
    {
		System.out.println(" im from show1");
	}
};
obj1.show1(); //here we called show 1    
     
     
     
     
     
     
     
     
     
     }}
