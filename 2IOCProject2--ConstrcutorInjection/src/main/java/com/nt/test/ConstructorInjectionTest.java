package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String args[]) {

		// Hold the name and location of spring bean cfg file
		//FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/appContext.xml");
		
		ClassPathResource res = new ClassPathResource("com/nt/cfgs1/appContext.xml");         
																										//(the best approach - industry used)
		
		//ClassPathResource res = new ClassPathResource("appContext.xml");
		
		
		// create IOC container (BeanFactory)
		XmlBeanFactory factory = new XmlBeanFactory(res);

		// get target spring Bean class object from IOC container
		Object obj = factory.getBean("wmg");

		// type casting
		WishMessageGenerator generator = (WishMessageGenerator) obj;

		// invoke the b method
		String result = generator.generate("Shahjada");

		System.out.println(result);

	}
}