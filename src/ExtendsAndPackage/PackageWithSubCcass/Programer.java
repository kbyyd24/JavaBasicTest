package ExtendsAndPackage.PackageWithSubCcass;

import ExtendsAndPackage.PackageWithSuperclass.Person;

public class Programer extends Person{
	private int salary;
	
	public Programer(int age, boolean sex, int height, String name, int salary) {
		super(age, sex, height, name);
		this.salary = salary;
		System.out.println("this is programer's constructer 1.\n");
	}
	
	public Programer(Person person, int salary) {
		super(person);
		this.salary = salary;
		System.out.println("this is programer's constructer 2.\n");
	}
	
	public void printMessage() {
		super.printMessage();
		System.out.println("salary: " + this.salary);
//		System.out.println(this.height + this.name);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
