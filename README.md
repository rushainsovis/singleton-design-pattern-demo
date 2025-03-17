# Singleton Design Pattern

## Definition

Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

## Problem

The Singleton pattern solves two problems at the same time, violating the Single Responsibility Principle:

1. Ensure that a class has just a single instance.
2. Provide a global access point to that instance.
3. The Singleton pattern is widely used in programming, especially when a class must have only one instance, such as a database connection or a logger.
4. The Singleton pattern provides a single point of access to a particular instance, so it is possible to use the same instance from anywhere in the application.
5. The Singleton pattern is implemented by creating a class with a method that creates a new instance of the class if one does not exist. If an instance already exists, it simply returns a reference to that object.
6. To make sure the object cannot be instantiated any other way, the constructor is made either private or protected.
7. The Singleton pattern is used in scenarios when a system-wide action needs to be coordinated from a single central place. The pattern provides a global point of access to the instance, so it can be shared by multiple entities.
8. The Singleton pattern is very similar to the static class, but the difference is that we can delay the initialization of the Singleton class. It is not initialized until it is called for the first time.
9. The Singleton pattern should be used when we must ensure that only one instance of a class is created and when the instance must be available through the entire program.
10. The Singleton pattern is used in logging, caches, thread pools, configuration settings, device driver objects, and database connections.

## Structure

1. The Singleton class declares the static method `getInstance` that returns the same instance of its own class.
2. The Singleton's constructor should be hidden from the client code. Calling the `getInstance` method should be the only way of getting the Singleton object.
3. The Singleton should always be accessed through the static method `getInstance`.
4. The Singleton pattern restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system.
5. The Singleton pattern provides a global point of access to the instance, so it is possible to use the same instance from any other class in the application.
6. The Singleton pattern is considered to be an anti-pattern and overuse of it should be avoided. It is not necessarily bad and could have some valid use-cases but should be used with caution because it introduces a global state in your application and change to it in one place could affect in the other areas and it could become pretty difficult to debug. The other bad thing about them is it makes your code tightly coupled plus it mocking the singleton could be difficult.
7. The Singleton pattern is used in scenarios when a system-wide action needs to be coordinated from a single central place. The pattern provides a global point of access to the instance, so it can be shared by multiple entities without creating a redundant instance of the class.
8. The Singleton pattern is used in logging, drivers objects, caching, thread pools, database connections.
9. The Singleton pattern is easy to implement but it’s also easy to use it in the wrong way. For example, you can create a Singleton using a static instance, but you can also create a Singleton using a static instance with a public constructor. Also, you can create a Singleton using a static instance with a public constructor and use lazy initialization. In each case, the Singleton pattern is implemented using a different approach.
10. The Singleton pattern is often used in conjunction with the Factory Method pattern. The Factory Method pattern is used to create an object, and the Singleton pattern is used to make sure that there is only one instance of the object.


