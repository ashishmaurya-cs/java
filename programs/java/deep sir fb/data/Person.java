
public class Person {
	private String name;
	private Certificate [] certi;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Certificate[] getCerti() {
		return certi;
	}
	public void setCerti(Certificate[] certi) {
		this.certi = certi;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
