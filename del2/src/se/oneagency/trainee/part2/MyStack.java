package se.oneagency.trainee.part2;

import java.util.Arrays;
import java.util.Optional;

public class MyStack<T> implements Stack<T> {
	
	private int DEFAULT_CAPACITY = 8;
	private int capacity;
	private T[] items;
	private int stackpointer = 0;

	public MyStack() {
		this.capacity = DEFAULT_CAPACITY;
		items = (T[]) new Object[capacity];
	}
	
	public MyStack(int capacity) {
		this.capacity = capacity;
		items = (T[]) new Object[capacity];
	}
	
	@Override
	public Stack<T> push(T newItem) {
		//Add item to top
		if(isFull()) {
			System.out.println("Scaling");
			maintainCapacity();
		}
		items[stackpointer] = newItem;
		stackpointer++;
		return null;
	}

	@Override
	public T pop() {
		//Remove top item
		if (isEmpty()) {
			System.out.println("No items to remove");
			return null;
		}
		else {
			stackpointer--;
			return items[stackpointer];
		}
	}

	@Override
	public boolean contains(T item) {
		//Check if the stack contains "item"
        Object o = Arrays.stream(items).filter(x -> item.equals(x)).findFirst();
        return o != Optional.empty();
	}

	@Override
	public T access(T item) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void maintainCapacity() {
		//Double the capacity of the Stack.
		capacity*=2;
		System.out.println(capacity);
		items = Arrays.copyOf(items, capacity);
	}
	
	public boolean isFull() {
		//Is the stack full?
		if (stackpointer == capacity)
			return true;
		return false;
	}

	@Override
	public boolean isEmpty() {
		//Is the stack empty?
		if (stackpointer == 0)
			return true;
		return false;
	}

}
