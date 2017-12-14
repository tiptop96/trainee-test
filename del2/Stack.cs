using System;

namespace OneTrack.Part2;
{
    interface Stack<T>
    {

        Stack<T> Push(T newItem);

        T Pop();

        Boolean Contains(T item);

        T Access(T item);

        Boolean IsEmpty();

    }
}