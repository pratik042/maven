package abstraction1;

// we will make a interface and make it implement by abstract class
interface A{
	void a();
	void b();
	
}
abstract class B implements A
{
public void a() {System.out.println( "im from a");	}
}
class C extends B
{
public  void b() { System.out.println(" im from b");}
}
public class demo3  {

	public static void main(String[] args) {
 A obj=new C();
 obj.a();
 obj.b();
	}

}
