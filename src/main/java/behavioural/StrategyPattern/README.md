# Strategy Design Pattern
The Strategy Pattern is a behavioral design pattern that defines a family of
algorithms, encapsulates each one, and makes them interchangeable. This allows
you to select an algorithm at runtime, based on the situation.

Used whenever we have a functionality that can be implemented in different ways.
Hence, whenever there are multiple ways to perform a behaviour, instead of coding
a behaviour into an entity, create a separate class for each type of that
behaviour.

This can be used in conjunction with factory design pattern to get the corresponding
object at runtime based on some condition.

For example : GoogleMaps calculates routes based on start point and end point.
This route can be calculated for four wheelers, two-wheelers, walking etc. So, 
we can have PathCalculator interface exposing findPath functionality. We can have
PathCalculatorFactory as well to emit out corresponding implementation of this
based on some input / condition.