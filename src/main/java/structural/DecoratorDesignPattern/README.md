# Decorator Design Pattern

This design pattern that lets you attach new behaviors to objects by placing 
these objects inside special wrapper objects that contain the behaviors.

Example : 
Suppose there is a burger class which is abstract and there are variety of this
class - VegBurger, NonBegBurger etc. Now if we want to add toppings to these
burger objects, then we can have a separate abstract decorator class that contains
this burger with all its functionalities and add the corresponding topping to it
for some added functionality for ex extra cheese or extra mayo in this case.

Sample run of the example : 
```
VEG_BURGER : 100.0
VEG_BURGER with extra cheese : 120.0
VEG_BURGER with extra cheese with extra mayo : 150.0
```