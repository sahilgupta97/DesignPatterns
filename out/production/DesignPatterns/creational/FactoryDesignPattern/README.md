# Factory Design Pattern
To help create an object of the correct subclass of the parent class / interface.
Factory Design Pattern provides a way to create objects without exposing the 
creation logic to the client. It promotes loose coupling by decoupling the client
from the concrete classes, making the code more flexible and easier to maintain.

### Practical Factory Design Pattern
We might need to create object at multiple places inside the codebase. Without
factory design pattern, we are bound to write if else at every place which violates
SRP, OCP and introduces code repetition.

Whenever we need to create an object of a particular interface / sub-class based 
on some condition, put logic of condition of subclass in factory.

One of the disadvantages of this pattern is that it violates the Open-Closed 
Principle. If we need to add a new type of product, we need to modify the factory
code, which means we need to recompile and redeploy the code.

Example : Database object based on input like mysql or mongodb etc.

### Factory method Design Pattern
When you want to map a specific type of one class to a specific type of another
class. It allows to have mapping between corresponding classes in two inheritances.
The creation of objects is delegated to the subclasses. This means that the 
factory method in the superclass is abstract, and each subclass provides its own
implementation of the factory method to create the object.

Con of this is that it starts violating the SRP when we start getting too much
of such relations.

Example : From a database object, you want to get corresponding query object. So,
you create a factory method inside Database class : + getQuery() : Query

### Abstract Factory Design Pattern
This is the extension of the factory method design pattern. In this, we extract
out all the factory methods of one interface to another interface because we want
to follow SRP.

On the very top layer, we can apply practical factory pattern to get the top
level object.

Example : Suppose in above Database class, now you want to get corresponding type
of transaction, security objects etc. So, you move all the factory methods like
getQuery, getTransaction etc. to DatabaseFactory interface.
