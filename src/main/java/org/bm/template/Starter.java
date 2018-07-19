package org.bm.template;

public class Starter {
	public static void main(String[] args) {

		// Parameterization of type Integer
		Message<Integer> obj1 = new Message<>();
		obj1.setValue(1); // only type Integer for the setValue method is
							// possible

		int val1 = obj1.getValue();
		System.out.println(val1);

		// Parameterization of type String
		Message<String> obj2 = new Message<String>("Hello Java");
		String val2 = obj2.getValue();
		System.out.println(val2);

		// obj1=obj2; //compilation error - non-variant parameterization

		// Default parameterization - Object
		Message obj3 = new Message(); // warning - raw type
		obj3 = obj1; // No compilation error - no parameterization
		System.out.println(obj3.getValue());
		obj3.setValue(new Byte((byte) 1));
		obj3.setValue("Hello obj3");
		System.out.println(obj3);// The object type is output, not the parameter
									// type
		obj3.setValue(16);
		System.out.println(obj3);
		obj3.setValue(null);

	}
}
