package chapter2
import scala.collection.mutable.Stack

/**
 * Created by Zyst on 10/24/2014
 */
object Calculator {

  /**
   * If the token is an operator, pop two operands off the stack,
   * perform the operation and push the result back on
   *
   * @param token - Our operators
   * @param stack - The List
   * @return
   */
  def handleOperator(token: String, stack: Stack[Int]): Boolean = token match {
    case "+" =>
      // rhs = Right hand side
      // lhs = Left hand side
      val rhs = stack.pop()
      val lhs = stack.pop()
      stack.push(lhs + rhs)
      true
    case "-" =>
      val rhs = stack.pop()
      val lhs = stack.pop()
      stack.push(lhs - rhs)
      true
    case "*" =>
      val rhs = stack.pop()
      val lhs = stack.pop()
      stack.push(lhs * rhs)
      true
    case "/" =>
      val rhs = stack.pop()
      val lhs = stack.pop()
      stack.push(lhs / rhs)
      true
    case _ => false
  }


  /**
   *
   * If the token is a number push it on the stack
   *
   * @param token - Our numbers
   * @param stack - The stack of numbers so we can do math in order
   * @return
   */
  def handleNumber(token: String, stack: Stack[Int]): Boolean = try {
    stack.push(token.toInt)
    true
  } catch {
    case _: NumberFormatException => false
  }

  def calculate(expression: String): Int = {
    val stack = new Stack[Int]

    // Handle each token
    for (token <- expression.split(" "))
      if(!handleOperator(token, stack) && !handleNumber(token, stack))
        throw new IllegalArgumentException("Invalid Token: " + token)

    stack.pop()
  }

  def main(args: Array[String]): Unit =
    if(args.length != 1)
      // Expect exactly one argument
      throw new IllegalArgumentException("Usage: Calculator <expression>")
    else
      println(calculate(args(0)))
}
