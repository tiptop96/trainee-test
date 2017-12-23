package se.oneagency.trainee.part2;

public interface Stack<T> {
    Stack<T> push(T newItem);

    T pop();

    boolean contains(T item);

    T access(T item);

    boolean isEmpty();
}