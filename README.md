# scala-gradle

An example of how to make a Scala project with Gradle

## Synopsis

Scala is great. Gradle is also great. sbt is great too but you have to get a special mindset to feel it.

So here is an example of how to write Scala code and build it with Gradle.

IntelliJ works fine here, just import a project and that's it.

## Remarks

### Testing and IDEA integration

#### Issue
If you right click a test class and select Run XxxxTest it works fine. 
But if you right click the whole folder test, or just the package with several classes and try to run tests, 
it does not work. Gradle test task tries to invoke JUnit tests which are not there.

#### Solution
There is a class TestBaseSpec which has an annotation `@RunWith(classOf[JUnitRunner])` which makes it
run with JUnit. This also works for all the classes that extend that one. Now you can run all the tests at once
or run the test task from Gradle.

Testing with coverage also works fine.

### Scala console

#### Issue
In sbt there is a very nice feature which is 'console'. You can interactively play with your classes in Scala REPL.
Gradle does not have such a feature.

#### Solution
Just use plain REPL, complie the classes and add them to the REPL's classpath. 

Here is an example:
```
~/scala-gradle$ ./gradlew compileScala
BUILD SUCCESSFUL in 8s
~/scala-gradle$ cd build/classes/scala/main
~/scala-gradle/build/classes/scala/main$ ls
org
~/scala-gradle/build/classes/scala/main$ scala -cp .
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_152).
Type in expressions for evaluation. Or try :help.

scala> import org.example.HelloScala
import org.example.HelloScala

scala> val h = new HelloScala
h: org.example.HelloScala = org.example.HelloScala@6a0f2853

scala> h.sayHello
res0: String = Hello from Scala

```

  