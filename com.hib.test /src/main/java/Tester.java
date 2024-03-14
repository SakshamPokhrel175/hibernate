//here the 4FILE (TESTER) is calling cfg configuration(3 FILE)hibernate.cfg.xml

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {
	public static void main(String[] args){
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		System.out.println("Successful Confirguration");
		
//here we required 1. Session Factory- it will going to build session
//				   2. session - it is our ENTITY related CRUD    (for read session is enough)
//				   3. Transaction - it will only going to commite data(update , delete and insert) not read 
		
		
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee employee = new Employee();
	//	employee.setId(); (id will be auto increment
		employee.setName("Hibernate");
		//know we need to save the session
		session.save(employee);
		transaction.commit();
		session.close();
		System.out.println("Data is inserted");
	}

}
