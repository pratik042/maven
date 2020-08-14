package abstraction1;
// so as we know we have to make a class abstract so simply we will add abstract keyword in front of it.

abstract class watch{
public watch(int i)
{

}
void time(int i)
{
System.out.println(" time is money="+i);
}
abstract void timer(); //here we made an method abstract,and hence its implementation is provided in next class
}
 public class demo4 extends watch
{ int j;
	 demo4(int i)
	 {
	super(i);
	j=i;
	 }
	 
void timer(int j){System.out.println(" dont waste time your are ahead,keep calm mind="+j);}

public static void main(String[] args) 
{ 
watch obj=new demo4(6);//SO KEEP IN MIND IN ABSTRACT WE NEED TO USE UPCASTING,OR RUNTIME POLYMORPHISM
obj.time(4);
obj.timer();
}

@Override
void timer() {
	// TODO Auto-generated method stub
	
}
}
