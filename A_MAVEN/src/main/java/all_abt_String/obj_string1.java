package all_abt_String;
//here we will convert the object to string
//if we override the toString() method of java obj then we can get the String form of object


public class obj_string1 {
int i;
String name;
	obj_string1(int i,String name)//2) we made constructor
	{this.i=i;//3) initialised values
	 this.name=name;
     }
	
//	public String toString()//4) so we took help of toString method
//	{
//		return name+"  "+i;//5) and returned values
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		obj_string1 obj=new obj_string1(42,"pratik");// 1)we need to initialise so we make a constructor
		//System.out.println(obj.toString());
		System.out.println(obj);// 3) so as we see we got the hashcode of the data but we need in string form,so to string method comes here
		                                              //4) now we got values
	}

}
