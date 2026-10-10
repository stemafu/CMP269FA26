//  
public class Box1 <T extends Comparable<T>> {
	private T data;
	
	public Box1(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public static void main(String [] args) {
		
		Box1<Integer> myBox = new Box1<Integer>(56);
		
		Box1<Double> myBox2 = new Box1<Double>(56.0);
		
		Box1 <Boolean>myBox3 = new Box1<Boolean>(true);
	
		Person<?> p1 = new Person();
		Box1 myBox4 = new Box1(p1);
	}

}
