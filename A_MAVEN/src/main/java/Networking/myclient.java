package Networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//QUEST199-GIVE EXAMPLE OF  SERVER AND CLIENT 
//ANS~ 
//here in my client class we have made client side,which will pass a string to server 
//server class is another

//CREATING client
//~for making client we need to make instance of socket class
public class myclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       try {
//		Socket s=new Socket("localhost",8081);//we passed local host as server is on same system ,and port number 6666 ,we can give any port number
//		
//		DataOutputStream dout=new DataOutputStream(s.getOutputStream());//we got instance of data output class
//		dout.writeUTF("hii im clientt,this is funnnn");//we wrote our msg in writeUTF format
//
//		dout.flush();
//		dout.close();
//		s.close();
//		
//			
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} 
	
    /////////////////////
       
       Socket s;
       try {
       	s = new Socket("localhost",3334);
       	DataInputStream din=new DataInputStream(s.getInputStream());  
       	DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
       	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
       	  
       	String str="",str2="";  
       	while(!str.equals("stop")){  
       	str=br.readLine();  
       	dout.writeUTF(str);  
       	dout.flush();  
       	str2=din.readUTF();  
       	System.out.println("Server says: "+str2);  
       	}  
       	  
       	dout.close();  
       	s.close(); 
       } 
       catch (IOException e) {
       	// TODO Auto-generated catch block
       	e.printStackTrace();
       }  

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}}
		





































