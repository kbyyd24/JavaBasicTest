package StringTest;

public class testStringBuffer {
	public static void main(String[] args) {
		testMethods();
		paramTransfer();
	}
	
	public static void testMethods() {
		StringBuffer sBuffer = new StringBuffer();
		System.out.println("inital sBuffer : " + sBuffer);
		sBuffer.append("Java is a good language!");
		System.out.println("append method :  " + sBuffer);
		sBuffer.reverse();
		System.out.println("reverse method : " + sBuffer);
		sBuffer.reverse();
		sBuffer.delete(10, 15);//第15个字符不会被删除
		System.out.println("delete method :  " + sBuffer);
		sBuffer.insert(10, "good ");
		System.out.println("insert method :  " + sBuffer);
	}
	
	public static void paramTransfer() {
		System.out.println("\ntransger stringBuffer as parameter");
		StringBuffer str1 = new StringBuffer("hello");
		changeValue(str1);
		System.out.println(str1);
	}
	public static void changeValue(StringBuffer str2) {
		str2.append(" world");
	}
}
