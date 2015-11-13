package PolDemo;

public class mainClass {

	public static void main(String[] args) {
		upcast();
		downcast();
		testDowncast();
	}
	
	public static void upcast() {
		System.out.println("\nupcast:");
//		superClass sup = new subClass();
		subClass sub = new subClass();
		superClass sup = sub;//sup与sub指向相同的地址空间
		sup.method1();
		sup.method2();
		System.out.println(sub);
		System.out.println(sup);
	}
	
	public static void downcast() {
		System.out.println("\ndowncast:");
		superClass sup = new subClass();
		subClass sub = (subClass)sup;
		sub.method1();
		sub.method2();
		sub.method3();
	}
	
	public static void testDowncast() {
		System.out.println("\ntest downcast:");
		try {
			superClass sup = new superClass();
			subClass sub = (subClass)sup;
			sub.method1();
		} catch (Exception e) {
			System.out.println("发生异常!");
			System.err.println(e);
		}
	}

}
