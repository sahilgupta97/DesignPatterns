# Singleton Pattern
1. For each request coming to backend server, it is very inefficient to create 
   a connection to the database. Maintaining a connection pool inside your 
   application and using it to cater all the requests would be efficient.
2. Logging is another use-case where you may want to send the logs/data to a place
   be it command line or any storage. Maintaining a single object of the logger
   and using it application wide would be memory and time efficient.
   
Maintaining only a single object inside your application is useful when you have 
stateless classes/code i.e. there are no attributes and only functionality that
you want to leverage is present. This is because the same object can be used by 
multiple threads at the same time - as it is stateless there is no requirement of
obtaining a lock.

### So why Singleton ? 
1. Shared resource.
2. Immutable class i.e. stateless class providing only some functionality.
3. Object creation is expensive.

### How to create ?
1. Private constructor, static attribute and method exposing the instance. But
   there is concurrency issue.
2. Eager initialisation solves concurrency issue by initialising the object at class
   load time. But it adds to application startup time and also what if the object
   needs few configs at runtime.
3. Taking a lock by using synchronized method. But this is very expensive as every
   time the threads would need to wait - I only need this at the time of first time
   object creation.
4. Double check locking to address the issue above.

Double check locking is very popular and used in industry - ex : Dagger springboot.
However, there are still certain ways of breaking above using Reflections or 
Serialization. We can opt for ENUM approach to address this if needed at the cost
of eager initialisation.




