package com.pack.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class applicaitionContext {
	public static void main(String args[])
	{
		ApplicationContext con=new ClassPathXmlApplicationContext("springConfig.xml");
		employee emp=(employee) con.getBean("emp");
		System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getAddress().getCity());
	}

}
