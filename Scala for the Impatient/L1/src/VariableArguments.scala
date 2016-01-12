/**
  * Created by zyst on 1/12/2016.
  */
object VariableArguments {
  def main(args: Array[String]) {
    def sum(args: Int*) = {
      var result = 0
      for (arg <- args) result += arg
      result
    }

    // 10
    println(sum(1, 4, 5))

    val vector = for (n <- 1 to 101) yield n

    // println(sum(vector)) This is an error

    // 5151  -  _* lets us treat the parameter as an argument sequence
    println(sum(vector: _*))

    // For recursive functions we must define a return type
    def recursiveSum(args: Int*): Int = {
      if (args.length == 0) 0
      else args.head + recursiveSum(args.tail : _*)
    }

    val sumCollected = recursiveSum(vector: _*)

    // 5151
    println(sumCollected)
  }
}
