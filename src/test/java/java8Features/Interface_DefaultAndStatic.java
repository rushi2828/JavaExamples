package java8Features;

public class Interface_DefaultAndStatic implements test{
	
	public static void main(String[] args) {  
//	Interface_DefaultAndStatic id = new Interface_DefaultAndStatic();
//	id.method();
//	id.method2();
		
		test.method3();
	}

}


interface test {

	default void method() {
		System.out.println("this is first method");
	}

	default void method2() {
		System.out.println("this is second method");
	}
	
	static void method3() {
		System.out.println("this is third method");
	}
}
