import java.io.IOException;
//here we have opened notepad with command

//Quest195~EXPLAIN RUNTIME CLASS
//ANS~
//1)Runtime class is used to interact with operating system
//2)There is only one instance of java.lang.Runtime class per java APP
//3)Runtime.GetRuntime() this method returns the  instance of Runtime class
//4)and above method is also called static Factory method becoz it returns instance

//some imp methods are
//Runtime.GetRuntime(),exit(),addShutDown Hook(),available processors ,free memory()
// Process exec(String command() ~this is one very imp method

public class runtime_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runtime r=Runtime.getRuntime();//we got the runtime class here
System.out.println(r.maxMemory());//this gives max memory java app can use
System.out.println(r.availableProcessors());//this is giving total processors in my machine
System.out.println(r.freeMemory());//this method gives amount of free memory in jvm
System.out.println(r.version());//return jvm version
try {
	System.out.println(r.exec("notepad"));//opened notepad with command
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
