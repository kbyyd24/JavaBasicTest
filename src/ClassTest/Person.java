package ClassTest;

public class Person {
	String name;
	int age;
	
	public Person() {
		System.out.println("This is a constructer without parameter.");
	}
	
	public Person(String name) {
		this();
		this.name = name;
		System.out.println("This is a constructer with one parameter.");
	}
	
	public Person(String name, int age) {
		this(name);
		this.name = name; 
		this.age = age;
		System.out.println("This is a constructer with two parameters.");
	}
	
	public void tell() {
		System.out.println(this);
	}
}
