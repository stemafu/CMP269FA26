
public interface ListInterface {
	
	/**
	 * This method returns the current size of the list.
	 * @return size of the list
	 */
	public int size();
	
	
	/**
	 * This method return true if the list is empty. Otherwise false
	 */
	public boolean isEmpty();
	
	/**
	 * This methods add the specified element to the end of the list
	 * @param num
	 */
	public void add(int num);
	

	
	/**
	 * This methods add the specified element at the specified index 
	 * in the list
	 * 
	 * What if the index is invalid? We will take care of this later.
	 * @param num
	 * @param index
	 */
	public void add(int num, int index);
	
	/**
	 * This method is used to return the element at the specified
	 * index
	 * 
	 * What if the index is invalid? We will take care of this later.
	 * @param index
	 */
	public int get(int index);
	
	/**
	 * This method removes and returns the element at the specified
	 * index
	 * 
	 * What if the index is invalid? We will take care of this later.
	 * @param index
	 */
	public int remove(int index);
	
	/**
	 * This method replaces and returns the element at the specified
	 * index with the given element
	 * @param num
	 * @param index
	 */
	public int replace(int num, int index);
	
	
	/**
	 * This method removes everything in the list
	 */
	public void removeAll();
	
	/*
	 * This method returns all the elements(items) in the list.
	 * 
	 */
	public String getAll();
	
}
