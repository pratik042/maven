package regex_i.e._Regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class find_method {

	public static void main(String[] args) 
	{
		// so we need a pass and a input and check them
		
System.out.println(" enter a pass");
Scanner sc=new Scanner(System.in);
Pattern pp=Pattern.compile(sc.nextLine());
Matcher mm=pp.matcher(sc.nextLine());

boolean found=false;
 while(mm.find())
 {
	 System.out.println("match word found  ="+mm.group()+" starting at  "+mm.start()+" ending at="+mm.end()+" matching ="+mm.matches());
found=true;
 }

 if(!found)
 {
	 System.out.println("not found");
 }
	}

}
