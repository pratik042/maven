package abstraction;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.rmi.ssl.SslRMIClientSocketFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;



abstract class bike{
	abstract void run();
}
public class dominar1 extends bike {

	void run()
	{
		System.out.println(" work hard , one day you will feel proud tht all that controlling mind was worth,YOU WILL GET NEW LIFE");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		domback obj1=new domback(0, null);// made
	    obj1.setBikename("dominSDFarR");
		obj1.setId(4);
		System.out.println(obj1.getBikename());
		System.out.println(obj1.getId());
		
		bike obj= new dominar1();
		obj.run();
		
		// now we will connect data to hibernate
		ServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta= new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=meta.buildSessionFactory();
		Session ss=sf.openSession();
		
		Transaction tx=ss.beginTransaction();
//		ss.save(obj);
		ss.save(obj1);
		//ss.close();//DONT MAKE IT CLOSE ,IT WILL CRASH 
		tx.commit();
		System.out.println(" object saved go and check database");
		System.out.println(" you are all set to rock in pune broo..keep goingg dont stopp");
		
		
	}

}
