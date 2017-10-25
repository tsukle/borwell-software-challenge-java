What is this?
------
This is a coding challenge I completed using Java in Eclipse, the challenge went as follows:  

Write a program that takes as input the dimensions of a room and outputs the following:
 * Area of the floor
 * Amount of paint required to paint the walls
 * Volume of the room

How do I use it?
------
In the `Build` folder there is a Jar file and a bat file. The Jar file is the compiled Java application and the batch file will run a command to run the program in a command prompt window.  
Alternatively, you can open up a command prompt window, navigate to the folder of the application and run this command: `java -jar program.jar`.  

NOTE: You must have Java installed to run this application. [Get it here!](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)

How do I view the source code?
------
You can view the source code by going to the `borwell.software.challenge` folder and following the folders into the class area. This folder contains the two classes that the application uses.  
You can also open the `borwell.software.challenge` project in Eclipse as it uses the Eclipse packaging system and should open up easily.

How can I re-build/compile the program?
------
After editing the code or to just rebuild the program. Assuming you are using Eclipse, go to the `file` menu and hit `export` from here follow the wizard and export the application as a Jar file to a specified folder.  
If you are using another IDE you may have other settings or options to work with.  

Building and compiling on the command line:
 * Using a command prompt, navigate to the folder which contains your .java files.
 * Create a new folder in the directory and name it `build`.
 * Run a compilation (build) command to the new folder: `javac -d ./build *.java`.
 * Enter the `build` folder and run the compile command: `jar cvf ChooseAFilename.jar *`