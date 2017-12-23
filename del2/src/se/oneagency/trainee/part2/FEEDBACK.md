Feedback till "VeryBasicStack".
===============================

## Introduktion.

_"Stack eller LIFO (Last In, First Out), en linjär datastruktur med två operationer: push och pop (ibland kallas operationen pull). Push lägger in ett element överst på stacken, och pop tar bort det översta elementet."_ -Wikipedia

A Stack can be extended to carry out more than these principal operations. Perhaps Peek() or Search().

## VeryBasicStack

Methods:

The First issue that i recognize with this implementation is that there is no code for handling a case where the stack is empty and the "pop()" method is run. To solve this i suggest that you add an "isEmpty()" method and run it in the "pop()" method before any operation is performed. If the stack is empty this should perhaps return null and print an error message.
The same is true for "push()". The current max of the stack is 1000 and if "push()" is performed when the size of the stack is equal too 1000 and error message should be printed.
The method "contains()" should be looking for "Optional.empty()" and not null in it's return statement. The object is "o" is never null.

Constructor:

I suggest that in the constructor there is a option to set the stack capacity.

Variables:

The contents of the stack could be set with a type argument (VeryBasicStack<T>).
