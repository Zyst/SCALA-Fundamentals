package Chapter1

/**
  * Created by zyst on 1/10/2016.
  */
object ForLoops {
  def main(args: Array[String]) {

    // We can use while loops
    var n = 10
    var r = 1

    while (n > 0) {
      r = r * n
      println("'r' is now " + r)
      n -= 1
    }

    // Or we can use a different Syntax:
    val a = 10
    var b = 1

    for (i <- 1 to a) {
      b = b * i
      println("'b' is now " + b)
    }

    // Advanced loops
    for (i <- 1 to 3; j <- 1 to 3) {
      // 11 12 13 21 22 23 31 32 33
      print(10 * i + j + " ")
    }

    println()

    // Advanced loop with a guard
    for (i <- 1 to 3; j <- 1 to 3 if i != j) {
      // 12 13 21 23 31 32
      print(10 * i + j + " ")
    }

    println()

    // Define inside loop
    for (i <- 1 to 3; from = 4 - i; j <- from to 3) {
      // 13 22 23 31 32 33
      print(10 * i + j + " ")
    }

    println()

    // Yield loops result in a collection of values
    val DemoVector = for (i <- 1 to 10) yield i % 3

    // Vector(1, 2, 0, 1, 2, 0, 1, 2, 0, 1)
    println(DemoVector)

    // Comprehension loops
    val CompVector = for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar

    // HIeflmlmop
    println(CompVector)

    // Another Comprehension loop
    val SecondCompVector = for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar

    // Vector(H, e, l, l, o, I, f, m, m, p)
    println(SecondCompVector)

    // Using newlines and Braces to declare for loops instead of ;
    for { i <- 1 to 3
      from = 4 - i
      j <- from to 3 } {
        // 13 22 23 31 32 33
        print(10 * i + j + " ")
    }
  }
}
