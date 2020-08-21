package nested_classed;
//NI =NESTED INTERFACE
//here we will create interface inside interface


interface A//outer interrface A
{
 interface B//interface B inside outer interface A
 {
	 void msg();//method inside B interface
}
	
}
public class ni1  implements A.B
{
 public void 	msg()
{
System.out.println("im from msg");
}
	
public static void main(String[] args)
	{
		// TODO Auto-generated method stub
A.B obj=new ni1();//upcasting
obj.msg();

	}

}
