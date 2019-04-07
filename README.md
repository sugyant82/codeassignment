# codeassignment
1)Structure of the project

To start with, I have created basically a master interface under package "code_assignment.interfaces" --> IAnimal.java
from which all types of animals will be derived. I have further created interfaces depending on the behaviour -> fly,walk,sing,swim

IFlyingAnimal.java
ISingingAnimal.java
ISwimmingAnimal.java
IWalkingAnimal.java

Following this, there are Abstract classes under package "code_assignment.abs" for Parrots and fishes
AFish.java
AParrot.java

All main classes (including Solution files, Builder and Factories) are in default package "code_assignment"


All concrete object classes under "code_assignment.obj" pacakge

Unit Test for Solution 1 is under package "code_assignment.unit_tests"


The solution for E. Counting animals is in the main file "AnimalCountProcessor.java" under default package "code_assignment"

I have also generated the javadoc for the project under "codeassignment/code_assignment/doc/"  folder path.

Thank You..

------ 

additional note: i had a tight schedule since last friday, so could not 
try bonus exercise. but my approach would be as below

internationalization of messages in different language:
i would externalize all messages into an external properties file.
then for each language i would create separate filenames appended by the language code.
this would have the necessary translation as during runtime
the actual msg wud obtain from prop file instead of hardvoded values.
i have extensive experience on internationalization, as in one of the past project,
i handed language customizations for 19countries using i18N libraries.


RESTful ApI TO EXPOSE THE SERVICE:
i would create different endpoints for the service methods in
this project using json format. this can be accessed directly from browser or consumed from frontend
application. im hands on with rest services and use frequently in my currebt project.





