package org.example

class HelloJavaTest extends TestBaseSpec {

  "HelloScala.sayHello" should "return a string" in {
    val returnedThing = new HelloJava().sayHello()
    returnedThing shouldBe a[String]
  }

  it should "contain a string 'Hello'" in {
    val returnedString = new HelloJava().sayHello()
    returnedString should include("Hello")
  }

  it should "contain a string 'Java'" in {
    val returnedString = new HelloJava().sayHello()
    returnedString should include("Java")
  }

  it should "not contain a string 'Scala'" in {
    val returnedString = new HelloJava().sayHello()
    returnedString should not include "Scala"
  }
}
