
# Design Patterns Overview

## 🏛️ Three Main Categories

| Category              | Purpose                                                                   | Key Patterns                                                                                                                                                           |
|----------------------|--------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Creational Patterns**  | How objects are **created** and instantiated flexibly                     | - **Singleton** <br> - **Factory Method** <br> - **Abstract Factory** <br> - **Builder** <br> - **Prototype**                                                            |
| **Structural Patterns**  | How classes/objects are **structured & composed**                       | - **Adapter** <br> - **Decorator** <br> - **Proxy** <br> - **Facade** <br> - **Composite** <br> - **Bridge**                                                             |
| **Behavioral Patterns**  | How objects **communicate & assign responsibilities**                   | - **Observer** <br> - **Strategy** <br> - **Command** <br> - **Template Method** <br> - **Iterator** <br> - **Chain of Responsibility** <br> - **Mediator**               |

---

## 🔍 Details:

### 🔵 Creational Patterns:

| Pattern           | Description                                                       | Example Use Case                                                 |
|-------------------|-------------------------------------------------------------------|-------------------------------------------------------------------|
| **Singleton**     | Ensures a class has only **one instance**                          | Logger, DB connection pool                                        |
| **Factory Method**| Subclasses decide which class to instantiate                      | Spring BeanFactory                                                |
| **Abstract Factory** | Provides an interface for creating related objects              | GUI toolkits, environment-specific configurations                 |
| **Builder**       | Step-by-step construction of complex objects                      | Configurations, constructing request objects                      |
| **Prototype**     | Clone existing objects                                            | Object cloning, caching copies                                    |

---

### 🟢 Structural Patterns:

| Pattern           | Description                                                       | Example Use Case                                                 |
|-------------------|-------------------------------------------------------------------|-------------------------------------------------------------------|
| **Adapter**       | Converts one interface to another (bridge incompatible systems)    | Legacy system integration                                        |
| **Decorator**     | Adds new behavior to objects **dynamically**                       | Adding UI features, Spring Security filters                       |
| **Proxy**         | Controls access to another object                                  | API Gateway, logging, lazy-loading                                |
| **Facade**        | Provides simplified interface over complex subsystems              | Simplified API over microservices                                 |
| **Composite**     | Treats groups of objects the same as individual objects            | File system hierarchy, tree structures                            |
| **Bridge**        | Separates abstraction from implementation                          | Different database drivers, cross-platform UIs                    |

---

### 🔶 Behavioral Patterns:

| Pattern                    | Description                                                     | Example Use Case                                                 |
|----------------------------|-----------------------------------------------------------------|-------------------------------------------------------------------|
| **Observer**               | Notify multiple objects when state changes (**pub-sub**)        | Kafka events, GUI listeners                                       |
| **Strategy**               | Switch between algorithms at runtime                            | Payment methods, sorting strategies                               |
| **Command**                | Encapsulate requests as objects                                  | Task queues, transactional commands                               |
| **Template Method**        | Define skeleton workflow, let subclasses customize steps         | Batch processing, algorithm steps                                 |
| **Iterator**               | Provides sequential access without exposing structure            | Collections traversal                                             |
| **Chain of Responsibility**| Pass request along a chain of handlers                           | Middleware pipelines, exception handling chains                   |
| **Mediator**               | Central mediator for object communication                        | Chat systems, UI component coordination                           |
