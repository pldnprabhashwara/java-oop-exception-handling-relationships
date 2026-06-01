# java-oop-exception-handling-relationships

Java OOP, Exception Handling, and RelationshipsWelcome to the Java OOP, Exception Handling, and Relationships repository. This project serves as a comprehensive guide and code repository demonstrating core Object-Oriented Programming (OOP) concepts, robust error-handling mechanisms, and the various ways objects interact and relate to one another in Java.🚀 Features & Concepts Covered1. Object-Oriented Programming (OOP) PillarsEncapsulation: Hiding internal state and requiring all interaction to be performed through well-defined methods (getters/setters).Inheritance: Reusing code and creating hierarchies using the extends keyword.Polymorphism: Allowing objects to take on multiple forms (Method Overloading and Method Overriding).Abstraction: Hiding complex implementation details using abstract classes and interfaces.2. Object RelationshipsUnderstanding how classes connect is crucial for good software design. This repo models the three primary types of relationships:Relationship TypeStrengthDescriptionExampleAssociationWeakA loose relationship where objects have their own lifecycles and no owner.Driver and CarAggregationMediumA "has-a" relationship where the child can exist independently of the parent.Department and ProfessorCompositionStrongA "part-of" relationship where the child cannot exist without the parent.House and Room3. Exception HandlingA deep dive into writing resilient code that gracefully handles runtime errors.Checked Exceptions: Handled at compile-time (e.g., IOException).Unchecked Exceptions: Runtime exceptions (e.g., NullPointerException, ArithmeticException).Custom Exceptions: Creating domain-specific exceptions by extending Exception or RuntimeException.Best Practices: Effective use of try-catch-finally, throw, throws, and try-with-resources.📁 Project StructurePlaintextsrc/
├── oop/
│   ├── AbstractionDemo.java
│   ├── EncapsulationDemo.java
│   ├── InheritanceDemo.java
│   └── PolymorphismDemo.java
├── relationships/
│   ├── Association/
│   ├── Aggregation/
│   └── Composition/
└── exceptions/
    ├── CustomException.java
    ├── TryCatchDemo.java
    └── ResourceManagement.java
💻 Code ExamplesComposition Example (Strong Relationship)If the Engine dies when the Car is destroyed, it's Composition:Javaclass Engine {
    // Engine implementation
}

class Car {
    private final Engine engine; // Car owns the Engine

    public Car() {
        this.engine = new Engine(); // Created together
    }
}
Custom Exception ExampleJavapublic class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
