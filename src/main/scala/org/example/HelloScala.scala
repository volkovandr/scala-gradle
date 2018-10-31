package org.example

class HelloScala {
  def sayHello(): String = "Hello from Scala"
}

object HelloScala extends App {
  println(new HelloScala().sayHello())
  println(new HelloJava().sayHello())
}
