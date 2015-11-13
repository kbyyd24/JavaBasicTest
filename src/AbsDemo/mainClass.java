package AbsDemo;

public class mainClass {
	public static void main(String[] args) {
//		People people = new People();
		Person person = new Person();
		person.setAge(21);
		person.setName("Ebanks");
		person.printMsg();
		person.afterBirth();
		person.printMsg();
	}
}
