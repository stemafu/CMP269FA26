
public class BetterArrayInts{
	
	/*
	 * 
	 * This class will be used to store a list of int values.
	 * This list will ne dynamic. It will be able to grow as
	 * you are adding elements.
	 * 
	 * 
	 * In order for us to create this better array, we need
	 * a base storage structure. We will use the regular array
	 * as our base storage structure. Next will create a variable
	 * that we will use to track the amount of the elements that
	 * have currently been added to the list.
	 * 
	 * Every time, we add a new element to the better array, 
	 * the tracking variable will be increased. This is to indicate that
	 * we have added a new item.
	 * 
	 * Every time, we remove an item from the better array, the tracking
	 * variable will be decreased. This is to show that something
	 * has been removed from the list.
	 */
	private final int ARRAY_CAPACITY = 5;
	private int [] elements;
	private int count; // This is the tracking variable
	
	public BetterArrayInts() {
		this.elements = new int[ARRAY_CAPACITY];
		this.count = 0;
	}
	
	public BetterArrayInts(int capacity) {
		this.elements = new int[capacity];
		this.count = 0;
	}
	
	/*
	 * The following method is used to return 
	 * the total amount of elements currently stored 
	 * in the Better Array (list).
	 * 
	 * The method returns the size of the list.
	 */
	public int size() {
		return this.count;
	}
	
	/*
	 * The following method returns whether a list is empty or not
	 * empty.
	 */
	
	public boolean isEmpty() {
		
		/*if(this.count == 0) {
			return true;
		}else {
			return false;
		}*/
		
		return (this.count == 0);
	}
	
	
	/*
	 * The following method is used to add the 
	 * specified element to the list.
	 */
	public void add(int element) {
		
		
		this.elements[this.count] = element;
		this.count++;
		/*
		 * This variable count is actually playing two major
		 * roles in our program.
		 * 1. keeping tracking of the total amount of elements
		 * currently stored in the list.
		 * 2.Keeping track of the next available space where we can
		 * insert (append) a new value in the list
		 */
		
	}
	
	
	public static void main(String [] args) {
		BetterArrayInts b = new BetterArrayInts();
		
		System.out.println(b.size());
		System.out.println(b.isEmpty());
		
		b.add(20);
		b.add(30);
		b.add(5);
		b.add(89);
		b.add(81);
		b.add(79);
		System.out.println(b.size());
		System.out.println(b.isEmpty());
	}

}
