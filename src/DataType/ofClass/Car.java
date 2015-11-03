package DataType.ofClass;

public class Car {
	public static int num = 5;
	private String name;
	private int price;
	
	public Car() {
		Car.num--;
	}
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		Car.num--;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
