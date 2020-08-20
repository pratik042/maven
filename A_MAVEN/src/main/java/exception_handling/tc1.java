package exception_handling;

import java.sql.SQLException;

import javax.rmi.ssl.SslRMIClientSocketFactory;

//try block is block where we write code that can throw an exception
/// try block shd be followed by catch block,catch block is used to handel an exception

public class tc1 {

	public static void main(String[] args) {

		String ss=null;
try {
int data=20/0;	//this will give arithmetic excepttion
System.out.println(ss.length());//this will give null pointer exception
}catch ( NullPointerException e) {
System.out.println("nul pointer hass  handeled="+e);
}
catch(  ArithmeticException n)
{
	System.out.println(" arithmetic excption has taken this="+n);
}
catch(Exception a)//if there is no suitable exception handler then parent class exception handler will handel it
{
	System.out.println(" excetion is handeled by  parent class excception="+a);
}

finally //this finally shd be used affter try and catch
{System.out.println(" im form finally block");
	
}
System.out.println(" im out of try catch and finally block");

	
		
		
		
		
		
	}

}
