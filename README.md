# Java Notes:

*Class:*
- A class is a blueprint or prototype from which objects are created.
- A class contains variables (data types) and methods (functions) to describe the behavior of an object.


*Object:*
- Object is a software bundle of related state and behavior.
- Objects have two characteristics namely state and behavior.

![image](https://user-images.githubusercontent.com/33669698/210375397-3bda288a-4683-44bf-adeb-fd2f127375a9.png)


*Constructor:*
- Constructor in Java is used in the creation of an Object that is an instance of a Class.
- Constructor name should be same as class name.
- It looks like a method but its not a method. 
- It wont return any value.
- If there is no constructor in a class, then compiler automatically creates a default constructor.

![image](https://user-images.githubusercontent.com/33669698/210375827-421fc806-dc8a-4b2c-83a7-987d3b8e2be8.png)


**OOPS Concepts:**

*Inheritance:*
- Inheritance is a process where one class inherits the properties of another class.
- We use the "extends" keyword in Java to allow the child class to inherit all the properties (data members and methods) of the parent class

![image](https://user-images.githubusercontent.com/33669698/210364843-ca6d2b3b-54ac-440f-84bc-7036a7082cef.png)

- We use "implements" keyword in Java to inherit the properties from an "interface".

- Types of Inheritance:
1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance


*Encapsulation:*
- Encapsulation is a mechanism of binding code and data together in a single unit.
- Also describe like 'Process of wrapping of code and data together in a single unit.

![image](https://user-images.githubusercontent.com/33669698/210366223-ffc33e39-c8c0-4aec-977d-f4f4bdeac18f.png)


*Polymorphism:*
- This allows us to perform a single action in different ways.
- Types of Polymorphism - 1.Method Overloading, 2.Method Overriding.

1. Method Overloading (Static Polymorphism/Compile time polymorphism)
- A class having multiple methods with same name but different parameters/arguments is called Method Overloading.
- Parameters with different data types

![image](https://user-images.githubusercontent.com/33669698/210368053-c1cef82c-5e74-4a97-a2a0-2760ae6972d1.png)

- Parameters with different sequence of a data types

![image](https://user-images.githubusercontent.com/33669698/210368212-fee32f96-62e0-4513-8d98-e34b7f9e8c2d.png)

- Different number of parameters

![image](https://user-images.githubusercontent.com/33669698/210368588-ec77b9d5-e436-4537-9b10-c13f4e24e358.png)

2. Method Overriding (Dynamic Polymorphism/Run time polymorphism)
- Declaring a method in child class which is already present in the parent class is called Method Overriding.
- Overriding means to override the functionality of an existing method.

![image](https://user-images.githubusercontent.com/33669698/210369405-8ac4ba81-af0f-4ab9-827f-14136d9619d0.png)
![image](https://user-images.githubusercontent.com/33669698/210369459-c5951428-5f46-4b1e-a2f9-ca85884fe6f5.png)
![image](https://user-images.githubusercontent.com/33669698/210369718-2322c898-33f8-483d-b97f-144758ae279b.png)

- When a parent class reference refers to the child class object then the call to the overridden method is determined at the runtime. So it is called runtime polymorphism. 
- It is because during method call which method (parent class or child class) is to be executed is determined by the type of an object.
![image](https://user-images.githubusercontent.com/33669698/210370161-b764b754-348d-408c-bd2c-5af7c46348f9.png)

*Abstraction:*
- Methodology of hiding the implementation of internal details and showing the functionality to the users.
- It is achieved using abstract classes and interfaces.

1. Abstract Class:

- Abstract classes may or may not include abstract methods
- A class which contains abstract keyword in its declaration then it is an Abstract Class.
- If a class is declared abstract then it cannot be instantiated.
- To access the abstract class, it must be inherited from another class.
- If a class has abstract method then we have to declare the class as abstract class.

![image](https://user-images.githubusercontent.com/33669698/210373841-1f9cd727-68d0-4246-aaa8-ef40a86b0629.png)

2. Interface:

- We can achieve 100% abstraction and multiple inheritance in Java with Interface.
- An interface can have methods and variables just like the class but the methods declared in interface are by default abstract.
- Interface methods do not have a body - the body is provided by the "implement" class
- On implementation of an interface, you must override all of its methods.
- Interface methods are by default 'abstract' and 'public'.
- Interface attributes are by default 'public', 'static' and 'final'.
- An interface cannot contain a constructor.

![image](https://user-images.githubusercontent.com/33669698/210374663-cab2e139-25e1-4bdf-b806-8e64128feb94.png)









