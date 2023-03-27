package Person.java;

public class Instructor extends Person{
	private double salary;

	
	 public Instructor(String name, String birthday, double salary) {
		 
		super (name, birthday);
		this.salary = salary;		
	}
		
  public String toString()
  {
     return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
  }
}


