
public class Person {
	/*
	 * The following two are instance variables
	 *  Notice, they are created inside a class 
	 *  but outside of any method.
	 *  
	 *  They are accessible in methods
	 */
	private String name;
	private int age;
	
	/* A constructor has the same name as the class
	 * and no return type
	 * 
	 * We can be able to overload constructor.
	 * 
	 * We can be able to define multiple constructors
	 * with the same name but different parameters.
	 */
	
	// Default constructor
	public Person() {
		age = 1;
		name = "initial name";
	}
	
	// an overloaded constructor - parameterized
	public Person(int age, String name) {
		/* it is possible that a parameter can have
		 * the same name as an instance variable. 
		 * Now if the goal is to copy a value from
		 * the parameter to the instance variable, 
		 * we need to distinguish between a local variable
		 * (parameter0 and the instance variable.
		 * 
		 * So, we can use the keyword this to refer to the
		 * instance variable.
		 */
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*
	 * Always remember that constructor does not have
	 * a return type at all at all times.
	 */
	
	/*
	 * Getters
	 */
	public int getAge() {
		return this.age; // return statement
	}
	
	public String getName() {
		return this.name;
	}
	
	// Setters
	public void setAge(int age) {
		
		int total = 0;
		
		if(age < 0) {
			this.age = 0;
		}else {
			this.age = age;
		}
	}
	
	public void setName(String name) {
		if(name == null || name.trim().length() == 0) {
			this.name = "No name entered";
		}else {
			this.name = name;
		}
	}
	
	public String toString() {
		return "Person => Name: " + this.getName() + " Age: " + this.getAge();
	}
	
	/*
	 * A bug is just an error. 
	 * 
	 * Debugging is the process of  identifying errors (bugs) and
	 * fixing them.
	 */
	
}
