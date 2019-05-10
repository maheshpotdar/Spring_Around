package com.mahesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mahesh.*;
import com.mahesh.model.Company;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/spring.xml");
		Company company = context.getBean("c1", Company.class);
//		System.out.println(company.getName());
		company.display();
	}
}
