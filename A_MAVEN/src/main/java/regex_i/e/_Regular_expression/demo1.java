package regex_i.e._Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Regex is short form of regular expression ,
//usually used in passwrod verification.
// we will have some fix string and the input is checked according to that

//java.util.regex package has 1 interface and 3 classes
//  it have matchresult interface and  pattern,matcher & patternsyntax exception classes

//in pattern class we store the password format
// and in matcher the user inputs the strings, if get matched then program runs else exception is thrown

public class demo1 {

	public static void main(String[] args) {
		// here we will learn 3 methods of making pattern and matcher
		
//METHOD 1==============================================================================================================
		Pattern pp=Pattern.compile("sonu");//pattern is class having method compile , WE ENTER REGEX
		Matcher mm=pp.matcher("sonuu");// case 1) this is passsword entered by user
		Matcher mm1=pp.matcher("sonu");// case 1) this is passsword entered by user
		//now lets check it for that we have method matches which return true or false
	    System.out.println("method1");
		//case1)
		boolean b=mm.matches();
		System.out.println("case1="+b);// so we got ouput as false
		//case2)
		boolean b1=mm1.matches();
		System.out.println("case2="+b1);// so we got ouput as true

//========================================================================================================================		
       System.out.println("\nmethod 2 ");
//ABOVE PROCESS IS BIT LENTHY BUT IS OF USE
//METHOD2)
//here we will try to write direct one line code			
     	boolean b2=Pattern.compile("sonu").matcher("sonnuu").matches();
     	boolean b3=Pattern.compile("sonu").matcher("sonu").matches();
        System.out.println("case1="+b2);
        System.out.println("case2="+b3);
		
		
		
		
		//========================================================================================================================		
       System.out.println("\nmethod 3 ");
// THE ABOVE PROCESS IS STILL  LENTHY ,SO THIS ONE IS USED
//METHOD 3)
//here we  write direct one line code
		//boolean b=Pattern.matches(regex, input);; SEE  WHATS CALLEDD REGEX,REGULAR EXPERSSION
		boolean b4=Pattern.matches("sonu","sonu");//true
		boolean b5=Pattern.matches("sonu","sonuu");//false
		System.out.println("case4="+b4+"\n"+"case5="+b5);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
