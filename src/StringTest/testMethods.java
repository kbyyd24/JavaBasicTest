package StringTest;
/**
 * String won't be changed when it was created
 * @author kbyyd
 *
 */
public class testMethods {

	public static void main(String[] args) {
		testLength();
		testSplit();
		testSubstring();
		testReplace();
		testConcat();
	}
	
	public static void testLength() {
		System.out.println("test length method:");
		String hwString = "Hello World!";
		System.out.println("length: " + hwString.length());
	}
	
	public static void testSplit() {
		System.out.println("\ntest split method:");
		String teString = "PHP is the best language!";
		String[] result = teString.split(" ");//有的符号（.、*等）需要转义处理才能得到预期结果
		System.out.println("result of \"" + teString + "\":");
		for (String iString : result) {
			System.out.println(iString);
		}
	}
	
	public static void testSubstring() {
		System.out.println("\ntest substring method:");
		String sentenc = "Every day is a new day!";
		String sub = sentenc.substring(6, 9);
		System.out.println("sub string is: " + sub);
	}
	
	public static void testReplace() {
		System.out.println("\ntest replace method:");
		String sentence = "Every day is a new day!";
		String reString = sentence.replace("a", "w");
		String reString2 = sentence.replaceAll("day", "week");
		String reString3 = sentence.replaceFirst("day", "24 hours");
		System.out.println("replace: " + reString);
		System.out.println("replaceAll: " + reString2);
		System.out.println("replaceFirst: " + reString3);
	}
	
	public static void testConcat() {
		System.out.println("\ntest concat method:");
		String hString = "Hello ";
		String wString = "World!";
		String hwString = hString.concat(wString);
		System.out.println("hString: " + hString);
		System.out.println("wString: " + wString);
		System.out.println("hwString: " + hwString);
	}

}
