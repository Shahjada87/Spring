package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Vehicle;

public class LooseCouplingTest {
	
		public static void main(String args[]) {
			
			//Create BeanFactory IOC Container
			DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
			XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
			
			//get target class obj
			Vehicle vehicle = (Vehicle)factory.getBean("vehicle");
			
			//invoke b methods
			vehicle.startVehicle();
			vehicle.move("hyd", "goa");
			vehicle.stopVehicle();
			
		}
}
