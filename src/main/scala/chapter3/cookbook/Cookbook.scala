package chapter3.cookbook

/**
 * Created by Zyst on 10/25/2014
 */


class Cookbook(val recipes: Map[String, Recipe]) {
  println("Recipes: " + recipes)

  // This is how to chain constructors
  def this() = this(Map.empty)
}