# Adapter Design Pattern
It allows objects with incompatible interfaces to collaborate. Allows to convert 
one type of thing to another type of thing. Generally, whenever you have to 
connect to 3rd party library, we do not connect to it directly as it violates the
Dependency Inversion principle.

Instead, connect to it via an interface. Create an interface with methods you need
from the 3rd party.

Example : Suppose you application needs Payment Gateway for billing. There are 
different such gateways like RazorPay, PayU etc. So, if want to plug and play 
multiple payment gateways then it would be better to create an interface with the
methods which we want and implement them using above different gateways. This
follows Dependency Inversion Principle and Open Closed Principle. 

Example sample run of phonepe : 
```
Making payment via Kotak Bank
Checking txn status done via Kotak Bank.
Making payment via Yes Bank.
Checking txn status done via Yes Bank.
```


