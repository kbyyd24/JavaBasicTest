package ExtendsAndPackage.PackageWithSuperclass;

public class Student extends Person{
	private Score score;

	public Student(int age, boolean sex, int height, String name, Score score) {
		super(age, sex, height, name);
		this.score = score;
		System.out.println("this is student's constructer 1.\n");
	}
	public Student(Person person, Score score) {
		super(person);
		this.score = score;
		System.out.println("this is student's constructer 2.\n");
	}
	
	//A private property of superclass, can't be read.
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getAge() {
//		return this.age;
//	}
	
	public void printMessage() {
		super.printMessage();
		System.out.println("Chinese: " + this.getChinese());
		System.out.println("Math: " + this.getMath());
		System.out.println("English: " + this.getEnglish());
//		System.out.println(this.height + this.name + this.sex);
	}
	
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public boolean getSex() {
		return this.sex;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return this.height;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setChinese(int chinese) {
		this.score.Chinese = chinese;
	}
	public int getChinese() {
		return this.score.Chinese;
	}
	
	public void setMath(int math) {
		this.score.Math = math;
	}
	public int getMath() {
		return this.score.Math;
	}
	
	public void setEnglish(int english) {
		this.score.English = english;
	}
	public int getEnglish() {
		return this.score.English;
	}

}
