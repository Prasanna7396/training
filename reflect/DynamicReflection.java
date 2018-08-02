package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicReflection {

	public static void main(String[] args) throws Exception {

		String qcn = "lti.reflect.Customer";

		// manually load the class

	    Class custClass = Class.forName(qcn);

		// geting the parameterized constructor with parameter string
		Constructor custConst = custClass.getConstructor(String.class);

		// instantiazing the parameterized constructor
		Object obj = custConst.newInstance("ks");
		System.out.println(obj);

		// getting private method of class with name and parameter type
		Method printMethod = custClass.getDeclaredMethod("print", null);

		// calling print method of customer objects
	    printMethod.setAccessible(true);
		printMethod.invoke(obj, null);
	}

}
