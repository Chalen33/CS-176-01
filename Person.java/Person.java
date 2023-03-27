package Person.java;

public class Person {

	private String name;
	private String birthday;
	
	public Person(String name, String birthday) {
		this.name =  name;
		this.birthday = birthday;
	}
	
	public String toString() {
		return "Person[name=" + name + ",birthYear=" + birthday + "]";
	}
}