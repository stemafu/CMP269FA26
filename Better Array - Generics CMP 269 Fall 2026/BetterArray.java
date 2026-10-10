
public class BetterArray <I extends Comparable<? super I>> implements 
ListInterface<I>{
	
	
	private final int ARRAY_CAPACITY = 5;
	private Object [] elements;
	private int count; // This is the tracking variable
	
	

	public BetterArray() {
		this.elements = new Object[ARRAY_CAPACITY];
		this.count = 0;
	}

	@Override
	public ListInterface<I> copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.count;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (this.count == 0);
	}

	@Override
	public void add(I element) {

		/*
		 * Any time. before we add an element, we will check to 
		 * see if the base array where we are keeping the elements
		 * is full.
		 * 
		 * If the base array is full, then we resize.
		 */
		
		if(this.isFull()) {
			
			this.resize();
			
		}
		
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
	
	/*
	 * This method returns true is the base array is full.
	 */
	private boolean isFull() {
		
		return (this.count == elements.length);
	}
	
	
	private void resize() {
		
		Object [] elementsCopy = new Object[elements.length * 2];
		
		for(int i = 0; i < this.count; i++) {
			elementsCopy[i] = this.elements[i];
		}
		
		
		this.elements = elementsCopy;
	}

	@Override
	public void add(I element, int index) throws IndexOutOfBoundsException {

		if(index < 0 || index > this.count) {
			//System.out.println("You provided an invalid index");
			throw new ArrayIndexOutOfBoundsException("You provided an invalid index " + index);
		}else {
			
			if(this.isFull()) {
				this.resize();
			}
			
		
			// consider the edge cases
			
			/*
			 * if we are adding at the end of the list, 
			 * we can just call the add(int num) method
			 */
			if(index == this.count) {
				// This means you want to add at the end (tail) of the list
				this.add(element);
			}else {
				
				
				/*
				 * Solution 1:
				 * 
				 * Take the current element from the list at the index 
				 * where we want to add the new item and move it to the 
				 * end of the list.
				 * 
				 * In other ways this means copy the element that is at the
				 * index where the new element is going to be placed and put
				 * it at the end of the list.
				 
				
				this.elements[this.count] = this.elements[index];
				// this line is the same as the one above this.add(this.elements[index]);
				
				this.elements[index] = num;
				this.count++;
				
				end of solution 1
				*/
				
				/* 
				 * 
				 * This solution 2:
				 * If we are not appending, we have to shift and add at the index after the shifting
				 */
				
				for(int i = count; i > index; i--) {
					
					this.elements[i] = this.elements[i - 1];
				}
				
				
				this.elements[index] = element;
				this.count++;
			}		
			
		}
		
	}

	@Override
	public I get(int index) throws IndexOutOfBoundsException {
		if(index < 0 || index >= this.count) {
			throw new IndexOutOfBoundsException("You provided an invalid index " + index);
		}
		
		
		return (I)this.elements[index];
	}

	@Override
	public I replace(I element, int index) throws IndexOutOfBoundsException {

		/*
		 * We need to verify that the index is valid.
		 * 
		 * We will address this part later
		 */
		
		if(index < 0 || index >= this.count) {
			
			//return -1; // We will address again this later
			throw new IndexOutOfBoundsException("You provided an invalid index " + index);
		}else {
			/*
			 * Get the value(element) that is at the index in the array
			 * and keep it into some variable.
			 * We want to keep this old value before it has been replaced
			 * by the new value. If we miss this step, then we will lose the
			 * old value and we won't have anything to return.
			 */
			I replacedElement = (I)this.elements[index];
			
			/*
			 * Since arrays allow random access and we already know where we
			 * have to replace, we will just go ahead and replace.
			 */
			this.elements[index] = element;
			
			/*
			 * Once we have updated the element at the index, next return the'
			 * old value (replacedElement)
			 */
			return replacedElement;
		}
	}

	@Override
	public I remove(int index) throws IndexOutOfBoundsException {

		if(index < 0 || index >= this.count) {
			// We need to fix this area
			//System.out.println("Invalid index " + index);
			//return -1;
			// This is now fixed
			throw new IndexOutOfBoundsException("You provided an invalid index " + index);
		}else {
			I removedElement = this.get(index);
			// int removedElement = this.elements[index];
			
			if(this.count == 1) {
				this.removeAll();
				//return removedElement;
			}else {
				for(int i = index; i < (this.count - 1); i++) {
					
					this.elements[i] = this.elements[i + 1];
				}
				this.count--;
				
				//return removedElement;
			}
			return removedElement;
		}
	}

	@Override
	public void removeAll() {
		this.elements = new Object[ARRAY_CAPACITY];
		this.count = 0;
		
	}

}
