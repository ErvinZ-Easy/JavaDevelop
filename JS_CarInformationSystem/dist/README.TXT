========================
BUILD OUTPUT DESCRIPTION
========================
Main Contents
1. Find me the first available passenger car.
2. How many cars are currently available. How many are not.
3. List all cars that are made by Toyota, GM, etc.
4. List all cars that were manufactured in a given year, ‘x’.
5. Find an available car with a minimum of x seats but no more than y seats.
6. Find a car with the given serial number. List the attributes of the found car.
7. List all cars given the model number.
8. List all the car manufacturers used by the (this) Uber.
9. When was the last time the fleet catalog was updated.
10. List all cars that are available in a given city.
11. List all cars that have expired maintenance certificate.


When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "assignment_3.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

Notes:

* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.
