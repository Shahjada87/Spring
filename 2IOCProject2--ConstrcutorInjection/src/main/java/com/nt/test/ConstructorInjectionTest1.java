package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest1 {

	public static void main(String args[]) {
		System.out.println("ConstructorInjectionTest1");
		// create IOC container (BeanFactory)
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		//create XmlBeanDenfinitionReader having IOC container 
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		//Load spring bean config file to read
		reader.loadBeanDefinitions("com/nt/cfgs1/appContext.xml");
		
		// get target spring Bean class object from IOC container
		Object obj = factory.getBean("wmg");

		// type casting
		WishMessageGenerator generator = (WishMessageGenerator) obj;

		// invoke the b method
		String result = generator.generate("Shahjada");

		System.out.println(result);

	}
}