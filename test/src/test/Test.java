package test;

import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		try {
			Class class1 = Class.forName("test.Student");
			Method[] method = class1.getMethods();
			for(Method m :method){
				m.invoke(class1.newInstance());
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
