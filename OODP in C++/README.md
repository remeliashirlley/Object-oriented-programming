## Inheritance : Create Animal subclasses<br />
1. In the same Animal.cpp file, write a Mammal class to inherit from the Animal class.<br />
   a. Hint Mammal: public Animal<br />
   b. Create a public method void eat() const for the Mammal Class<br />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;void eat() const {<br />
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cout << "Mammal eat " << endl ;<br />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br />
   c. Create a constructor which will initialize the name and color of the Mammal object. <br />
   d. Create a destructor for the Mammal class.<br />
   e. Create a Mammal object in main and called the speak method.<br />
   f. Build and run the application<br /><br />
   
2. In the same Animal.cpp file, write a Dog class to inherit from the Mammal class.<br />
   a. Create an attribute string owner for the Dog Class<br />
   b. Create a constructor which will initialize the name, color and owner of the Dog object.<br />
   c. Create a destructor for the Dog class.<br />
   d. Create a Dog object in main and called the speak method.<br />
   e. Build and run the application<br /><br />
   
3. Override the speak method for Dog to “Woof”<br />
   a. Put the “virtual” keyword in the appropriate class and method and write the code for Dog
object to speak appropriately.<br />
   b. Build and run the application.<br />
   c. Is the output as you have expected?<br /><br />
   
4. Pure Method<br />
   a. declare the move function in the Animal class as a pure method
using the “virtual” keyword and “= 0”<br />
   b. Build the application<br />
   c. Understand and resolve the error/s you encountered.<br />
   d. Add the code in main for Dog object to called the move method.<br /><br />
   
## Polymorphism : Build a Zoo<br />
1. Using the abstract class<br />
   a. The Animal class is now an abstract class<br />
   b. Abstract class cannot be instantiated but it can be used as a reference type<br />
   c. Add the following code in main<br />
Animal *animalPtr = new Dog("Lassie", White, "Andy");<br />
   d. Use the animalPtr to call the speak and move methods.<br />
   e. Build and run the application.<br /><br />
   
2. Build a Zoo<br />
   a. In this task, you will write your own code.<br />
   b. The requirements are :<br />
      - Create 2 more subclasses Cat and Lion inheriting from Mammal class<br />
      - Override the move and speak methods to perform a simple printout of the mammal, eg Cat meow, Lion Roar.<br />
      - Create a program to ask user to select the animals from the list Eg display :<br />
      Select the animal to send to Zoo :<br />
      (1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit<br />
      - You should use an array to store the selected Mammal object.<br />
      - When “Move all animals” is selected, you should traverse the array and make the animals move, speak and eat.<br />
      - Will your code still work if it is an array of Animal objects ?<br />
   
