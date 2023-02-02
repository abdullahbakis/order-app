# Order App
This is a simple Java application that allows a customer to create orders, save and view their invoices. The application was built using IntelliJ and Maven.

## Features
The following features are included in the application:

* Creation of new customers
* Listing of all customers
* Listing of customers with the letter 'C' in their names
* Listing of the total amount of invoices for customers who signed up in June
* Listing of all invoices in the system
* Listing of invoices over 1500TL in the system
* Calculation of the average of invoices over 1500TL in the system
* Listing of the names of customers with invoices under 500TL in the system
* Listing of companies in which the average invoices for the month of June are below 750TL.
## Technical Details
The application was built using Java, and the following concepts have been implemented:

Final, static, overload, override, constructor, inheritance, polymorphism, encapsulation
List, Set, Map
* SOLID principles
* Stream for listing operations
* Maven for project management
## How to Run
1. Clone the repository to your local machine: 
```
https://github.com/abdullahbakis/order-app.git
```

2. Open the project in IntelliJ or any Java IDE of your choice.
3. Run the Main class located in the 


```
src/main/java/com/abdullahbakis/Main.java
```  

file.

4. Follow the instructions provided in the console to perform the desired actions.

## Maven Commands and Outputs
```
PS C:\IdeaProjects\order-app> mvn compile
[INFO] Scanning for projects...
[INFO] 
[INFO] Building order-app 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ order-app ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ order-app ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 4 source files to C:\Abdullah\Program Dosyalar─▒\IdeaProjects\order-app\target\classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.733 s
[INFO] Finished at: 2023-02-02T23:42:28+03:00
[INFO] ------------------------------------------------------------------------
```

```
PS C:\IdeaProjects\order-app> mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< org.bootcamp:order-app >-----------------------
[INFO] Building order-app 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ order-app ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ order-app ---
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ order-app ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Abdullah\Program Dosyalar─▒\IdeaProjects\order-app\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ order-app ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ order-app ---
[INFO] No tests to run.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.406 s
[INFO] Finished at: 2023-02-02T23:42:53+03:00
[INFO] ------------------------------------------------------------------------
```

## Licensing
This application is licensed under the [MIT License](https://github.com/abdullahbakis/order-app/blob/master/LICENCE).
