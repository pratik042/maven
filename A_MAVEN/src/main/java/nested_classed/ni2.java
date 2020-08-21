package nested_classed;
class AA
{
	interface B
{
	void show();
}
}
public class ni2 implements AA.B
{
 public void show() 
 {
	 System.out.println("im from show");
 }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
AA.B obj=new ni2();
obj.show();

	}

}
