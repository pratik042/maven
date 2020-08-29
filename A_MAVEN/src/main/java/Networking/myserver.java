package Networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import com.mysql.fabric.Server;
import com.mysql.jdbc.interceptors.ServerStatusDiffInterceptor;

//here we are going to make server so we get server socket class
public class myserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//try {
//	ServerSocket ss=new ServerSocket(8081);//we made server socket class to make sever and accept clientt rqst
//	Socket s=ss.accept();//first we need to make socket open to get requests
//    DataInputStream din=new DataInputStream(s.getInputStream());	
//	
//    String str=(String)din.readUTF();//now we made a string variable str to read UTF  from client
//    System.out.println("message="+str);
//    
//    ss.close();
//   	
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//////////////////////


try {
	ServerSocket ss = new ServerSocket(3334);
	Socket s=ss.accept();  
	DataInputStream din=new DataInputStream(s.getInputStream());  
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	String str="",str2="";  
	while(!str.equals("stop")){  
	str=din.readUTF();  
	System.out.println("client says: "+str);  
	str2=br.readLine();  
	dout.writeUTF(str2);  
	dout.flush(); 
	}  
	din.close();  
	s.close();  
	ss.close(); 
} 
catch (IOException e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}  
 
	
		
	}

}
