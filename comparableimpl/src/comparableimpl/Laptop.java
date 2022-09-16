package comparableimpl;

//public class Laptop implements Comparable<Laptop> {
	
public class Laptop{
	int price;
	String name;
	int Ram;
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [price=" + price + ", name=" + name + ", Ram=" + Ram + "]";
	}
	public Laptop(int price, String name, int ram) {
		super();
		this.price = price;
		this.name = name;
		Ram = ram;
	}
//	@Override
//	public int compareTo(Laptop o) {
//		// TODO Auto-generated method stub
//		return this.price - o.price;
//	}
	
	

}
