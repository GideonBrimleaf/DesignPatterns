## Setting up JUnit Testing in a Vanilla Kotlin project with IntelliJ

The IntelliJ IDE enables you to play around with Kotlin without necessarily setting up a Gradle or Maven project. This is fine until you want to start bringing in some packages into your project such as those for unit tests.

To set up JUnit tests in IntelliJ step through the following:

1. Navigate to File -> Project Structure -> Modules and select the dependencies tab
2. There are no dependencies outside of the JDK and the source code, so click the + symbol to add a dependency which is under 'JARs or directories'
3. This will open up the file explorer for your machine, navigate to the installation directory for IntelliJ
4. Once there you are looking for the lib sub-folder. This will contain a whole bunch of libraries already installed with IntelliJ, from there you are looking for two libraries:
  * junit-4.12
  * hamcrest-core-1.3
5. You may need to select these individually but they should both be present in the dependencies dialogue box. Once there click ok and you should have the ability to import JUnit into your Kotlin project
