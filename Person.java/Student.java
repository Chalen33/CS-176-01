package Person.java;

public class Student extends Person{
	
	private String major;
	
	public Student(String name, String birthday, String major){
		
		super (name, birthday);
		this.major = major;
	}

	public String toString(){
	 return "Student[super=" + super.toString() + ",major=" + major + "]";
	}
}
