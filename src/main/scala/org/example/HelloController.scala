package org.example

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class HelloController(helloScalaService: HelloScalaService, helloJavaService: HelloJavaService) {

  @GetMapping(path = Array("/helloScala"))
  def helloScala(): String = helloScalaService.helloMessage

  @GetMapping(path = Array("/helloJava"))
  def helloJava(): String = helloJavaService.helloMessage()
}
