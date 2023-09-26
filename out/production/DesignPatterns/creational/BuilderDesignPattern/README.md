# Builder Design Pattern
1. Used when we have a class that has lot of attributes.
2. We want to validate the value of attributes.
3. Immutable class
4. Provide the values of attributes which we need and other values to default.

When we have such classes with lot of attributes :
1. Constructor approach would not work as the client would need to refer to the
ordering of attributes which is prone to errors.
2. There will be too many constructors for different combinations - Code repetition
Client would have to take care of the default by themselves.

