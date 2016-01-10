import scala.math._
import BigInt.probablePrime
import scala.util.Random

val randomBigInt: BigInt = probablePrime(100, Random)

val baseString: String = randomBigInt.toString(36)
