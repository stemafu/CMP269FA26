
public class PersonDriver {
	
	public static void main(String [] args) {
		
		/* To create an object in Java, we use the keyword new*/
		
		Person p1 = new Person();
		p1.setAge(20);
		p1.setName("Drink Water");
		
		
	
		/*
		 * The following are directly accessing 
		 * name and age, this is happening because 
		 * name and age are public.
		 * p1.name = "Drink Water";
		 * p1.age = 20;
		 */

		System.out.println(p1);
		System.out.println(p1.toString());
		
		
		
		Person p5 = new Person();
		p5.setAge(-5);
		p5.setName(null);
		
		
		Person p6 = new Person("mary smith", 25);
	}

}
