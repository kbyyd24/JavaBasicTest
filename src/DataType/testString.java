package DataType;

public class testString {

	public static void main(String[] args) {
		createByNew();
		createByValue();
		createByTwo();
		paramTransfer();
	}
	
	/**
	 * 利用构造方法创建，会直接在堆空间中创建，地址不同
	 * 利用“==”判断，是判断的变量的地址
	 * 利用equals方法判断，是判断变量的内容
	 */
	public static void createByNew() {
		String doc = new String("document");
		String doc1 = new String("document");
		System.out.println("\ncreate by constructor");
		System.out.println(doc == doc1);
		System.out.println("doc equals doc1?" + doc.equals(doc1));
	}

	/**
	 * 直接赋值，会先检查字符串常量池是否存在该字符串
	 * 不存在时会创建一个新的
	 * 存在时会直接引用
	 */
	public static void createByValue() {
		String doc = "document";
		String doc1 = "document";
		System.out.println("\ncreate by constant");
		System.out.println(doc == doc1);
		System.out.println("doc equals doc1?" + doc.equals(doc1));	
	}
	
	public static void createByTwo() {
		String doc = new String("document");
		String doc1 = "document";
		System.out.println("\ncreate by two methods");
		System.out.println(doc == doc1);
		System.out.println("doc equals doc1?" + doc.equals(doc1));	
	}
	
	
	public static void paramTransfer() {
		System.out.println("\ntransger string as parameter");
		String str1 = "world";
		changeValue(str1);
		System.out.println(str1);
	}
	public static void changeValue(String str2) {
		str2 = "hello";
	}
}
