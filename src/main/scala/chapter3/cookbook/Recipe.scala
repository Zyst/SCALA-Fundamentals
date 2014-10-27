package chapter3.cookbook

/**
 * Created by Zyst on 10/25/2014
 */

// By making this private we make the factory below (object) the only way to construct this
case class Recipe (ingredients: Map[String, Mass], directions:List[String]) {
  def shoppingList(kitchen: Map[String, Mass]): List[String] =
    for {
      (name, need) <- ingredients.toList
      have = kitchen.getOrElse(name, Grams(0))
      if have.compareTo(need) < 0
    } yield name
}

// If we do "case class" all the code below is deprecated. Scala automatically does it for us.
// We can also leave off "val" once we make this a case class

// As we see we can declare both a Class AND and object
// This is used for factories
//object Recipe {
//  // Here we changed make to apply
//  def apply(ingredients: List[String] = List.empty,
//            directions:List[String] = List.empty):
//    Recipe = new Recipe(ingredients, directions)
//
//  def unapply(recipe: Recipe): Option[(List[String], List[String])] =
//    Some((recipe.ingredients, recipe.directions))
//}

//class Cookbook(val recipes: Map[String, Recipe]) {
//  println("Recipes: " + recipes)
//
//  // This is how to chain constructors
//  def this() = this(Map.empty)
//}

// We are replacing this "class" with a Simpleton Object, for fun(?)

object Cookbook {
  val pbj = Recipe(
    Map("Peanut butter" -> new Grams(10),
        "Jelly" -> new Kilograms(0.5),
        "Bread" -> new Grams(250)),
    List("Put the peanut butter and Jelly on the Bread"))

  val baconPancakes = Recipe(
    Map("Bacon" -> new Kilograms(1),
        "Pancakes" -> new Milligrams(10)),
    List("Take some bacon and put it in a pancake"))
}

// Polymorphism and Inheritance
// We switch everything to case classes now so we can get some auto generation
// Also by using sealed here we do something similar to changing this to a "Final"
sealed abstract class Mass extends Comparable[Mass] {
  def amount: Double
  def toGrams: Grams
  def compareTo(that: Mass): Int = (this.toGrams.amount - that.toGrams.amount).toInt
}
case class Grams(amount: Double) extends Mass {
  override def toGrams: Grams = this
  override def toString: String = amount + "g"
}
case class Milligrams(amount: Double) extends Mass {
  override def toGrams: Grams = Grams(amount / 1000)
  override def toString: String = amount + "mg"
}
case class Kilograms(amount: Double) extends Mass {
  override def toGrams: Grams = Grams(amount * 1000)
  override def toString: String = amount + "kg"
}
