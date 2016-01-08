// This was done using the terminal in the video, rather make a Worksheet

for (i: Int <- 1 to 10) println("I'm awesome")

val original = List(1, 2, 3)


// Java Style

import collection.mutable.MutableList

val transformed = new MutableList[Int]

for (i: Int <- 0 until original.size) transformed += original(i) * 2

transformed

// Scala Style

transformed.clear()

for (i <- original) transformed += i * 2

transformed

// Even better SCALA style
for (i <- original) yield i * 2


for (i <- List(1, 2, 3); j <- List(4, 5, 6)) yield i * j

for {
  i <- List(1, 2, 3)
  j <- List(4, 5, 6)
} yield i * j


for {
  i <- List(1, 2, 3)
  j <- List(4, 5, 6)
  product = i * j
  // We only want those divisible by 2
  // This is called a guard
  if product % 2 == 0
} yield product
