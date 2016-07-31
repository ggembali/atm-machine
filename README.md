## ATM Machine

Design an ATM machine
- implement money transactions only
- verifying user credentials
- dispense money

## Content of the repository

### UML documents

- [Flowchart](uml/flow-diagram.md) diagram.   
- [Entity](uml/entity-diagram.md) diagram. 

### Source code/ implementations

Structure of the project is a standard maven. All dependencies are available in the public repositories. Some of the libraries used include:
- injection: google Guice
- logging: slf4j
- testing: testNG, mockito

### Tests

All the tests which are implemented are running during the maven install goal - **mvn clean install**.

