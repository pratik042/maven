package interface1;

import java.util.Scanner;

import org.hibernate.boot.archive.scan.internal.StandardScanOptions;

interface C{
	void bun();
	static int solve(int i)
	{
		
		return i*i;
	}
	
}
	public class static1 implements C{
 public void bun()
{
	System.out.println(" keep increasing focus  each min keep brain slowed down like you are hipnotised ,you will remeber this for longer time , and you wont get distracted,THIS IS KEY TO CONSISTANCY ");
}
 void tun()
 {
	 System.out.println("  more  time to pratice fisrt time more time you will remeber all this, AND THAT IS REQUIRED ,DONT JUST RUN BEHIND COMPLETION,RUN BEHIND FOCUSSING MIND");
 }
 void kun()
 {
	 System.out.println(" make habit of asking question ,tht why is this step,and what is does");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		static1 obj=new static1();
		obj.bun();
		obj.tun();
		obj.kun();
		System.out.println("ENTER VALUE YOU WANT TO SQUARE");
		Scanner sc=new Scanner( System.in);
		int k=sc.nextInt();
		int result=C.solve(k);
		System.out.println(result);
		
	}


}
