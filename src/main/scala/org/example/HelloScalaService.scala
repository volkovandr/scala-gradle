package org.example

import org.springframework.stereotype.Service

@Service
class HelloScalaService {
  private val helloScala = new HelloScala

  def helloMessage: String = helloScala.sayHello()
}
