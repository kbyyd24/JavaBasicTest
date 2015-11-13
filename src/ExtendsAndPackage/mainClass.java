package ExtendsAndPackage;

import ExtendsAndPackage.PackageWithSubCcass.Programer;
import ExtendsAndPackage.PackageWithSuperclass.Person;
import ExtendsAndPackage.PackageWithSuperclass.Score;
import ExtendsAndPackage.PackageWithSuperclass.Student;

public class mainClass {
	public static void main(String[] args){
		Person person = new Person(21, true, 174, "kobe");
//		person.printMessage();
		
		Score score = new Score();
//		score.Chinese = 90;//A default property of Score in different packages,can't be read.
		score.setChinese(90);
		score.setEnglish(87);
		score.setMath(98);
		
		Student stu = new Student(person, score);
		stu.printMessage();
		
		Programer programer = new Programer(person, 8000);
		programer.printMessage();
	}
}
