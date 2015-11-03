package DataType;


/**
 * 整数型（包括short和长整型）、浮点型、字符型和布尔型都属于基本数据类型
 * @author kbyyd
 *
 */
public class testBasicDataType {
	public static void main(String[] args) {
		testInt();
		testFloat();
		testDouble();
		testChar();
		testBoolean();
	}
	
	public static void testInt() {
		int a = 1;
		@SuppressWarnings("unused")
		int b = a;
		b = 2;
		System.out.println(a);
	}
	
	public static void testFloat() {
		float f1 = 3.14f;
		@SuppressWarnings("unused")
		float f2 = f1;
		f2 = 0.618f;
		System.out.println(f1);
	}
	
	public static void testDouble() {
		double d1 = 3.14;
		@SuppressWarnings("unused")
		double d2 = d1;
		d2 = 0.618;
		System.out.println(d1);
	}
	
	public static void testChar() {
		char ch1 = 'a';
		@SuppressWarnings("unused")
		char ch2 = ch1;
		ch2 = 'b';
		System.out.println(ch1);
	}
	
	public static void testBoolean() {
		boolean b1 = false;
		@SuppressWarnings("unused")
		boolean b2 = b1;
		b2 = true;
		System.out.println(b1);
	}
	
}
