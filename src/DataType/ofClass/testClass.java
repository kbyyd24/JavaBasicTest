package DataType.ofClass;

import java.util.Scanner;

public class testClass {

	public static void main(String[] args) {
		createByNew();
		createByEqual();
		valuedLater();
		staticTest();
		paramTransfer();
	}
	
	public static void createByNew() {
		System.out.println("createByNew");
		Car car1 = new Car("ford", 3000);
		Car car2 = new Car("ford", 3000);
		System.out.println(car1 == car2);
		System.out.println(car1.equals(car2));
		System.out.println();
	}
	
	public static void createByEqual() {
		System.out.println("createByEqual");
		Car car1 = new Car("ford", 3000);
		System.out.println("Before car2 create, Car.num = " + Car.num);
		Car car2 = car1;//use the same memory address, Car.num won't change
		System.out.println("After car2 created, Car.num = " + Car.num);
		System.out.println(car1 == car2);
		System.out.println(car1.equals(car2));
		System.out.println("Before car2 change car2.name, car1.name = " + car1.getName());
		car2.setName("test");
		System.out.println("After car2 changed car2.name, car1.name = " + car1.getName());
		System.out.println();
	}
	
	public static void valuedLater() {
		System.out.println("Create car2 by constructor without value, and valued after it by car1");
		Car car1 = new Car("ford", 300);
		Car car2 = new Car();
		car2 = car1;//car2变量开始指向car1的空间，之前car2通过构造方法创建的空间不再使用，等待内存回收
		System.out.println(car1 == car2);
		System.out.println(car1.equals(car2));
		System.out.println("Before car2 change car2.name, car1.name = " + car1.getName());
		car2.setName("test");
		System.out.println("After car2 changed car2.name, car1.name = " + car1.getName());
		System.out.println();
	}
	
	public static void staticTest() {
		Scanner s = new Scanner(System.in); 
		while(Car.num > 0){
			System.out.print("Input name"); 
			String name = s.nextLine();
			System.out.print("Input price");
			int price = Integer.parseInt(s.nextLine());
			Car car = new Car(name, price);
			System.out.println("The car's name is " + car.getName());
		}
		s.close();
	}
	
	//把对象作为参数传递
	public static void paramTransfer() {
		System.out.println("\ntransfer object as parameter");
		Car car1 = new Car("ford", 3000);
		changeValue(car1);
		System.out.println(car1.getName());
	}
	public static void changeValue(Car car2) {
		car2.setName("changan");
	}

}
