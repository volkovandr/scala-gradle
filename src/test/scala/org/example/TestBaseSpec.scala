package org.example

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpecLike, Matchers}

@RunWith(classOf[JUnitRunner])
abstract class TestBaseSpec extends FlatSpecLike with Matchers
