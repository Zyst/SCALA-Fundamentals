// This was done using the terminal in the video, rather make a Worksheet

def monthName(n: Int): String =
    if ( n == 1) {
      "January"
    } else if (n == 2) {
      "February"
    } else {
      // Cut this short, we get the gist of it.
      "Unknown"
    }


monthName(1)

monthName(2)

monthName(13)

// Now we'll see pattern matching

def monthNamePattern(n: Int): String = n match {
    case 1 => "January"
    case 2 => "February"
    // Underscore is a wildcard pattern
    case _ => "Unknown"
}

monthNamePattern(1)

monthNamePattern(2)

monthNamePattern(3)

// Collapse cases

def daysInMonth(n: Int): Int = n match {
    case 1 | 3 | 5 | 7 | 8 | 10 | 12 => 31
    case 4 | 6 | 9 | 11 => 30
    case 2 => 28
    case _ => 0
}

daysInMonth(12)

daysInMonth(2)

daysInMonth(4)

def whatIsIt(something: Any): String = something match {
    case 1 => "The Number One"
    case "hello" => "A Greeting"
    case List(_, _, _) => "A list of three values"
    case List(_, _) => "A list of two values"
    case _ => "I don't know"
}

whatIsIt(1)

whatIsIt("hello")

whatIsIt(1, 1, 1)

whatIsIt(List("hello", "greetings", 2))

whatIsIt(List("hello", "goodbye"))

// Variable Binding Pattern
def variableBinding(something: Any): String = something match {
    case n: Int => "The number " + n
    case s: String => "The String " + s
    case _ => "Something else"
}

variableBinding(3)

variableBinding(4)

variableBinding("Dohohoho")

def composition(something: Any): String = something match {
    case List (a, b, c) => "A List of three elements: " + a + " " + b + " " + c + "."
    case _ => "Something else"
}

composition(List("Hello", 1, "Rock"))

