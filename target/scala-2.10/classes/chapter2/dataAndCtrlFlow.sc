// This was done using the terminal in the video, rather make a Worksheet
// Checking Inferred Types
val s = if (true) "hello" else "goodbye"

if (true)  "hello" else 1

if (false) "hello" else 1

if (true) 1 else 1.0

if (true)  "hello" else List(1, 2, 3)

// Type mismatch
// val d: String = if(true) "hello" else 1