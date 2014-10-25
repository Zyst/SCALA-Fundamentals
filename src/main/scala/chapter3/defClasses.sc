// This was done using the terminal in the video, rather make a Worksheet
//
//import chapter3.cookbook.Cookbook
//import chapter3.cookbook.Recipe
//
//val cookbook = new Cookbook
//
//val recipe = new Recipe
//
//cookbook.recipes = Map("p.b. & j." -> recipe)
//
//recipe.ingredients = List("Peanut Butter", "Jelly", "Bread")
//
//recipe.directions =
//  List("Put the peanut butter and jelly on the bread")
//
//cookbook.recipes("p.b. & j.")
//
//cookbook.recipes("p.b. & j.").ingredients
//
//cookbook.recipes("p.b. & j.").directions
//

// We changed our full structure at this point. Further tests below.

import chapter3.cookbook._

val recipe = new Recipe(List("Peanut butter", "Jelly", "Bread"),
                  List("Put the peanut butter and jelly on the bread"))
// We can also do this:

new Recipe(directions = List("Make a sandwich"))
new Cookbook

