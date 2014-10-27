// This was done using the terminal in the video, rather make a Worksheet

import chapter3.cookbook._

//val r1 = Recipe()

//val r2 = Recipe()

// r1 == r2
// Why is this false? Well, it was until some changes:


// Only downside is that we don't get auto init to empty
// val r1 = Recipe(List.empty, List.empty)

// val r2 = Recipe(List.empty, List.empty)

// r1 == r2

Cookbook.pbj match {
  case Recipe(ingredients, directions) =>
    println(ingredients)
    println(directions)
}

Cookbook.pbj.copy()

// With copy we can modify values(We changed this a bit ago) so it no longer works
// Cookbook.pbj.copy(ingredients = List())

