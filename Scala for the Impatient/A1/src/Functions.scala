package Chapter1

/**
  * Created by zyst on 1/12/2016.
  */
object Functions {
  def main(args: Array[String]) {
    // Normal define, no need to specify return type
    def abs(x: Double) = if (x >= 0) x else -x

    // 44.2 and 42.1
    println(abs(44.2) + " and " + abs(-42.1))

    // Multi line function, last line is return
    def fac(n: Int) = {
      var r = 1
      for (i <- 1 to n) r = r * i
      // same as return r
      r
    }

    // 3628800
    println(fac(10))

    // If we want to make a recursive function we do need a return type
    def recFac(n: Int) : Int = if (n <= 0) 1 else n * recFac(n - 1)

    // 3628800
    println(recFac(10))

    // Setting default values
    def decorate(str: String, left: String = "[", right: String = "]") = left + str + right

    // [Hello]
    println(decorate("Hello"))

    // <<<Hello]
    println(decorate("Hello", "<<<"))

    // <<<Hello>>>
    println(decorate(left = "<<<", right = ">>>", str = "Hello"))

  }
}
