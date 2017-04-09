package model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource = new ClassPathResource("applicationContext.xml");  
		BeanFactory factory = new XmlBeanFactory(resource); 
		
		// name the Bean ID in XML file in getBean()
		Employee s = (Employee)factory.getBean("emp"); 
		s.displayInfo(); 

	}

}
