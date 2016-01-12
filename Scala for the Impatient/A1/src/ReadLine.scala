package Chapter1

/**
  * Created by zyst on 1/10/2016.
  */
object ReadLine {
  def main(args: Array[String]) {
    val name = readLine("Your name: ") // read line is deprecated apparently

    print("Your age: ")
    val age = readInt() // Same as above, deprecated.

    printf("Hello, %s! Next year, you will be %d.\n", name, age + 1)

  }
}
