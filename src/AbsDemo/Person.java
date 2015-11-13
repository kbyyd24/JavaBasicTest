package AbsDemo;

public class Person extends People{
	private String name;
	
	@Override
	public void printMsg() {
		System.out.println("name: " + this.name + "\nage: " + this.getAge());
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
