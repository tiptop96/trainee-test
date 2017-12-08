package se.oneagency.trainee.part2;

import java.util.Arrays;

public class VeryBasicStack  {

    private int stackPointer;
    private Object[] data;

    public VeryBasicStack() {
        data = (Object[]) new Object[1000];
        stackPointer = 0;
    }

    /**
     * Push an item on the top of the BasicStack.
     * @param newItem An item to put on the stack.
     * @return Itself so that you can chain pushes.
     */
    public VeryBasicStack push(Object newItem){
        data[stackPointer] = newItem;
        stackPointer++;
        return this;
    }

    /**
     * Pops the topmost item of the stack.
     * @return The topmost item.
     */
    public Object pop(){
        stackPointer--;
        return data[stackPointer];

    }

    /**
     * Checks if the item is on the stack.
     * @param item The item to search for.
     * @return True if the item is found on the stack.
     */
    public boolean contains(Object item){

        Object o = Arrays.stream(data).filter(x -> item.equals(x)).findFirst();

        return o != null;
    }

    /**
     * Get the item of the stack. Will pop until it finds it of throw an IllegalArgumentException if not found.
     * @param item item to get of the stack.
     * @return Object item of the stack.
     */
    public Object access(Object item){
        while(stackPointer > 0){
            Object tmpItem = pop();
            if(item.equals(tmpItem)){
                return tmpItem;
            }
        }
        throw new IllegalArgumentException("Could not find the item on the stack:" + item);

    }




}
