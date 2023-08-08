# Observer Design Pattern
Used when changes to one object need to be reflected in one or more other objects.
This pattern solves the problem of a class calling many other classes on occurence
of a special behaviour that needs updating multiple systems.

In this, we create an interface that every dependency should implement. This way
it is the dependency object responsibility to perform required action whenever
something happens to the functionality it has subscribed to.

Example :
Flipkart while placing order does multiple things :
1. Send sms about the order.
2. Sends email as well
3. Generates the invoice.
So either we could inside Flipkart's placeOrder() method invoke above methods 
   which also requires us to inject those dependencies inside it. Or, we can 
   create an interface OrderPlacedObserver exposing a method onOrderPlaced which
   takes the order as param. The services like email, sms, invoice generator etc. can implement this interface and at Flipkart side, we
   can simply have a list of such observers.

In general, the Observer Pattern is useful in any situation where multiple objects need to be kept in sync with one another, without tightly coupling them together.