package org.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringEntrypoint

object SpringEntrypoint extends App {
  SpringApplication.run(classOf[SpringEntrypoint])
}
