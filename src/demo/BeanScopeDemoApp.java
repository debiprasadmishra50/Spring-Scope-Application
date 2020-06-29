package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp 
{
	public static void main(String[] args) 
	{
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// same hashcode, Point to same direction
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		
		System.out.println(System.identityHashCode(theCoach));
		System.out.println(System.identityHashCode(alphaCoach));
		
		boolean result = (theCoach == alphaCoach);
		System.out.println(result);
		
		context.close();
	}
}
