package chapter3.cookbook

/**
 * Created by Zyst on 10/25/2014
 */
class Recipe(
              val ingredients: List[String] = List.empty,
              val directions:List[String]   = List.empty) {
  println("Ingredients: " + ingredients)
  println("Directions "   + directions)
}
