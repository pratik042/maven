package exception_handling;
//exception handling is a way to handel the compile time and runtime errors,so that normal flow of app can be maintained
//is java exception iss the event that stops the normal flow of  program

//KEEP IN MIND~
// if you are going to call an method that is going to give an exception then you either handel it b try catch block or
//or you handel it by throws keyword

//throw keyword handels both checked and unchecked exceptions,we can throw custom exception
//throws keyword handels only checked exceptions


import java.io.IOException;

public class throws1 {
        int d,c;
        static int data;
throws1(int d,int c)
{
    	 d=d;
	     c=c;
}
public int p(int d,int c)throws IOException
{		System.out.println("im from p");
		int data=d/c;
		System.out.println("im from method="+data);

		return data;
}
	void q()
{
	int age=17
			;
	if( age<18)
	{
		throw new ArithmeticException("you are under age");//throw  example
	}
	else {
		System.out.println(" you are eligble");
	}
}
public static void main(String[] args)
{
        int a=2;
		int b=0;
	   // int data1=0;
		throws1 obj=new throws1(a, b);
		obj.q();
		
		try {
			System.out.println("im from main="+obj.p(b, a));
		} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		System.out.println("SOME PROBELM IN METHOD P="+e);
		}
		System.out.println("came to main ");
		
}

	

}
