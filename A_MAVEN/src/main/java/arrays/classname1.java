package arrays;

public class classname1 {

	public static void main(String[] args) {
// here we will get class name
// we know JAVA ARRAY IS AN OBJECT ITSELF  so a proxy class is made
		
int arrrr[]= {32,43,23};
Class c=arrrr.getClass();
String name=c.getName();
String a=c.getPackageName();
String x=c.getSimpleName();
System.out.println("name of class="+name);
System.out.println("name of package="+a);
System.out.println("name of simple class name="+x);

	}

}
