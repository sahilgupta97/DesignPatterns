# State Design Pattern
It is often used where there are multiple states in a system and each state behaves
differently.
There’s a finite number of states which a program can be in. Within any unique state,
the program behaves differently, and the program can be switched from one state to 
another instantaneously.

State machines are usually implemented with lots of conditional statements that 
select the appropriate behavior depending on the current state of the object.
The biggest weakness of a state machine based on conditionals reveals itself once we
start adding more and more states and state-dependent behaviors. Most methods will 
contain monstrous conditionals that pick the proper behavior of a method according to 
the current state. Code like this is very difficult to maintain because any change to
the transition logic may require changing state conditionals in every method.

The State pattern suggests that you create new classes for all possible states of an 
object and extract all state-specific behaviors into these classes.
Instead of implementing all behaviors on its own, the original object, called context,
stores a reference to one of the state objects that represents its current state, and 
delegates all the state-related work to that object.

### VENDING MACHINE OUTPUT (Without any if or conditionals for state management)
```
4.0 coin is inserted
3.0 coin is inserted
Button for aisle : 1 is pressed.
Product with id : 1 getting dispensed. Please collect item and change of Rs. 2.0
10.0 coin is inserted
Button for aisle : 1 is pressed.
Product with id : 1 getting dispensed. Please collect item and change of Rs. 5.0
7.0 coin is inserted
Button for aisle : 2 is pressed.
Product with id : 2 getting dispensed. Please collect item and change of Rs. 5.0
```