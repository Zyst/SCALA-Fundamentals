package chapter3.cookbook

/**
 * Created by Zyst on 10/25/2014
 */

// By making this private we make the factory below (object) the only way to construct this
class Recipe private (
              val ingredients: List[String] = List.empty,
              val directions:List[String]   = List.empty) {
  println("Ingredients: " + ingredients)
  println("Directions "   + directions)
}

// As we see we can declare both a Class AND and object
// This is used for factories
object Recipe {
  def make(ingredients: List[String], directions:List[String]): Recipe =
    new Recipe(ingredients, directions)
}

//class Cookbook(val recipes: Map[String, Recipe]) {
//  println("Recipes: " + recipes)
//
//  // This is how to chain constructors
//  def this() = this(Map.empty)
//}


// We are replacing this "class" with a Simpleton Object, for fun(?)

object Cookbook {
  val pbj = Recipe.make(
    List("Peanut butter", "Jelly", "Bread"),
    List("Put the peanut butter and Jelly on the Bread"))

  val baconPancakes = Recipe.make(
    List("Bacon", "Pancakes"),
    List("Take some bacon and put it in a pancake"))
}