package ArrayTest.dataType;

public class intArray {

	public static void main(String[] args) {
		createByNew();
		createByEvaluation();
		createByAnother();
	}
	
	public static void createByNew() {
		System.out.println("create by constructed function");
		int[] a = new int[5];
		int[] b = new int[5];
		System.out.print("a == b ? ");
		System.out.println(a==b?true:false);
	}
	
	public static void createByEvaluation() {
		System.out.println("create by evaluation");
		int[] a = {0, 1, 2, 3, 4};
		int[] b = {0, 1, 2, 3, 4};
		System.out.print("a == b ? ");
		System.out.println(a==b?true:false);
	}
	
	public static void createByAnother() {
		System.out.println("create by another");
		int[] a = new int[5];
		int[] b = a;
		System.out.print("a == b ? ");
		System.out.println(a==b?true:false);
		b[1] = 2;
		System.out.print("a == b ? ");
		System.out.println(a==b?true:false);
	}

}
