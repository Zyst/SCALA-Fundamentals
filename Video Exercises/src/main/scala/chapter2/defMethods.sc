// This was done using the terminal in the video, rather make a Worksheet

// For vals
val x: Int = 1

// For methods we use Def
def add(a: Int, b: Int): Int = a + b

add(1, 1)

// We can shorten the above with Inference
def addShort(a: Int, b: Int) = a + b

addShort(1, 1)

// Recursive numbers
def fib(n: Int): Int = if (n == 1 || n == 2) 1 else fib(n - 1) + fib(n - 2)

//fib(1)
//fib(2)
//fib(3)
//fib(4)
//fib(5)

// This stops the Worksheet at this point; Why?
//fib(99)

println("Hello")

def printHello() = println("hello")

printHello()

printHello

// No parenthesis test
def printSomething = println("Something")

printSomething

def z = 1

z

