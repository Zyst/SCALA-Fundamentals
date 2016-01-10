package Chapter1

import scala.math._
import BigInt.probablePrime
import scala.util.Random

/**
  * Created by zyst on 1/10/2016.
  */
object RandomBaseString {
  def main(args: Array[String]) {
    val randomBigInt: BigInt = probablePrime(100, Random)

    val baseString: String = randomBigInt.toString(36)

    println(baseString)
  }
}
