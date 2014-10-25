// This was done using the terminal in the video, rather make a Worksheet

def dumb (n: Int): String = n match {
    case 1 => "success!"
}

// We intentionally throw an exception
// dumb(2)

"1".toInt

// Another exception
// "not a number".toInt

def parseInt(s: String): Int =
    try {
        s.toInt
    } catch {
        case e: NumberFormatException => 0
    }

parseInt("1")

parseInt("this is a test")

def moreExceptions(s: String): Int =
    try {
        s.toInt
    } catch {
        case e: NumberFormatException => 0
        case _: Throwable => 0
        case _: NullPointerException => 0
        case _ => 0
        // Catching everything is bad practice, but this is an example
    }

def optionInt(s: String): Option[Int] =
    try {
        Some(s.toInt)
    } catch {
        case e: NumberFormatException => None
    }

optionInt("0")

optionInt("1")

optionInt("Random text")
