package org.example

class HelloScalaTest extends TestBaseSpec {

  "HelloScala.sayHello" should "return a string" in {
    val returnedThing = new HelloScala().sayHello()
    returnedThing shouldBe a[String]
  }

  it should "contain a string 'Hello'" in {
    val returnedString = new HelloScala().sayHello()
    returnedString should include("Hello")
  }

  it should "contain a string 'Scala'" in {
    val returnedString = new HelloScala().sayHello()
    returnedString should include("Scala")
  }

}
