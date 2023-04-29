package c4119spring.springex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import c4119spring.springex2.java.Contract;
import c4119spring.springex2.java.Employee;
import c4119spring.springex2.java.Permanent;

public class Office {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
		Contract e =  con.getBean(Contract.class);
		e.knowInfor();
		Employee e2 = con.getBean(Permanent.class);
		e2.knowInfor();
	
	}

}