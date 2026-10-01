
public class BetterArrayIntsDriver {
	

	public static void main(String [] args) {
		BetterArrayInts b = new BetterArrayInts();
		BetterArrayInts list = new BetterArrayInts();
		//System.out.println(b.size());
		//System.out.println(b.isEmpty());
		
		b.add(20);
		b.add(30);
		b.add(5);
		b.add(89);
		b.add(81);
		b.add(79);
		
		
		System.out.println( b.get(5));
		System.out.println( b.get(0));
		System.out.println( b.get(1));
		
		System.out.println(b.replace( 189, 3));
		
		System.out.println( b.get(2));
		b.add(200, 2);
		System.out.println( b.get(2));
		System.out.println( );
		System.out.println( );
		
		for(int i = 0; i < b.size(); i++) {
			System.out.println( b.get(i));
		}
		
		b.remove(0);
	
	    b.replace(200, 0);
		System.out.println( );
		System.out.println( );
		
		for(int i = 0; i < b.size(); i++) {
			System.out.println( b.get(i));
		}
		
		
		/*
		int start = 10;
		
		for(int i = 0; i < 10_000_000; i++) {
			
			b.add(start);
			start += 10;
		}
		*/
		
		
		
		
		System.out.println(b.size());
		System.out.println(b.isEmpty());
		
		b.removeAll();
		
		System.out.println("Size here should be 0 after removing all " + b.size());
		System.out.println("isEmpty here should be true after removing all " + b.isEmpty());
	   
		
		
		Student someStudent;
		someStudent = new Student();
	}


}
