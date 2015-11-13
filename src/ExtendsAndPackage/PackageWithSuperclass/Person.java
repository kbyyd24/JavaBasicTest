package ExtendsAndPackage.PackageWithSuperclass;

public class Person {
	private int age;
	boolean sex;
	protected int height;
	public String name;
	
	public Person(int age, boolean sex, int height, String name) {
		this.age = age;
		this.sex = sex;
		this.height = height;
		this.name = name;
		System.out.println("This is class Person's constructer 1.\n");
	}
	
	public Person(Person person) {
//		this.age = person.getAge();
		this.age = person.age;//A private property in the same class,can be read.
		this.sex = person.sex;
		this.height = person.height;
		this.name = person.name;
		System.out.println("This is class Person's constructer 2.\n");
	}
	
	public void printMessage() {
		System.out.println("name：" + name + "\nsex: " + sex + "\nage: " + age + "\nheight: " + height);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
