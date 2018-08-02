package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
//import java.text.DateFormat.Field;

public class CustomerReflection {
	
	public static void main(String[] args) {
		Customer c1=new Customer("polo");
		
		System.out.println(c1);
		
		
	
		Class cc=c1.getClass();
		System.out.println(cc);
		
		System.out.println("list of const");
		Constructor[] constructors=cc.getConstructors();
		for(Constructor c:constructors)
		{
			System.out.println(c);
		}
		
		System.out.println("list of methods");
		Method[] methods=cc.getMethods();
		
		for(Method m:methods)
			System.out.println(m);
		
		
		System.out.println("list of declared methods");
		Method[] dmethods=cc.getDeclaredMethods();
		
		for(Method m1:dmethods)
			System.out.println(m1);
		
		System.out.println("list of FIELDS");
		Field[] fields=cc.getDeclaredFields();
		
		for(Field f:fields)
			System.out.println(f);
            
		
		
		
	}

}
