package Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//quest201~EXPLAIN URL CONNECTION CLASS
//ANS~This url class helps us to connect to any website through our application
//or it  is a link between url and application
//OpenConnection() method of url class returns obj of url class
//we can display web page data by  using  getInputStream() method

public class url_connectionclass {

	public static void main(String[] args) {
		//1st we will gett url class
		try {
			URL obj=new URL("https://stackoverflow.com/questions/24735741/return-1-in-java");
			
		URLConnection obj1=obj.openConnection();
		InputStream obj2=obj1.getInputStream();
		int i;
		while((i=obj2.read())!=-1) 
		{
			System.out.print((char)i);
		}
			
	
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
