# Bridge Design Pattern
Bridge pattern decouple an abstraction from its implementation so that the two 
can vary independently. It is used mainly for implementing platform independence
features. It adds one more method-level redirection to achieve the objective.

Used when extending the classes grows in multiple dimensions. It follows the 
principle of separating abstractions and implementations.
Let's say Shape is an abstract class and Square, Triangle etc are its concrete
classes(N). Now if there is a use case of different colored(M colors) shapes then
we would need to create N x M concrete classes which is not ideal as most of them
would share same other properties and behaviours.
A good way would be to extract out what's changing i.e. colors in this case and 
implement different colors separately. So, Shape would have another abstraction
called Color instead of concrete implementations.


Example : Notification service where type of messages and modes of sending those
messages vary. There could be multiple combinations of these, and it would be a
bad idea to compose them using inheritance as the count of classes would grow 
exponentially.