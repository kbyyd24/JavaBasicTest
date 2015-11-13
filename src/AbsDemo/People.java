package AbsDemo;

public abstract class People {
	private int age;
	
	public abstract void printMsg();
	
	public void afterBirth() {
		this.age++;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
