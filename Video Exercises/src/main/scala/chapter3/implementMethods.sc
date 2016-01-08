// This was done using the terminal in the video, rather make a Worksheet

val list = List(1, 2, 3)

List.apply(1, 2, 3)

list match {
  case List(a, b, c) => a + b + c
}


// About: Tuples
(1, "Hello", List(1, 2, 3))

// Above is shorthand for
Tuple3(1, "Hello", List(1, 2, 3))

def safeDivide(x: Int, y: Int): Option[Int] =
  if(y == 0) None else Some(x / y)

safeDivide(4, 2)

safeDivide(4, 0)

// We made the unapply method at this point and are going to see
// How to use it as an extractor

import chapter3.cookbook._

Cookbook.pbj match {
  case Recipe(ingredients, directions) =>
    println(ingredients)
    println(directions)
}

def isSimple(recipe: Recipe): Boolean = recipe match {
  case Recipe(_, List(_)) => true
  case _ => false
}

isSimple(Cookbook.pbj)

isSimple(Cookbook.baconPancakes)

object Even {
  def unapply(n: Int): Option[Int] =
    if (n % 2 == 0) Some (n / 2) else None
}

Even.unapply(4)

Even.unapply(3)

4 match {
  case Even(half) => half
}

3 match {
  case Even(half) => half
  case _ => "None"
}



