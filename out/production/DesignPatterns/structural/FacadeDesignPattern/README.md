# Facade Design Pattern
Used when a class becomes too complex and we break it into multiple classes so as 
to hide the complexities to external world.

Example : Suppose if Flipkart placeOrder() and cancelOrder() functionality becomes
too long and complex. Then we can create two separate interfaces which would handle
the two behaviours separately using PlaceOrderFacade and CancelOrderFacade, the 
flipkart class can use these facades and hide the complexity.