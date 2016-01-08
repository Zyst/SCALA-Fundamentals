package chapter0

import org.scalatest.FunSuite

/**
 * Created by Zyst on 10/23/2014
 */
class HelloTest extends FunSuite {
  test("sayHello Method works correctly") {
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }
}
