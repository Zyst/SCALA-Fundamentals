/**
  * Created by zyst on 1/12/2016.
  */
object Procedures {
  def main(args: Array[String]) {
    // A procedure is called only for its effect, and it returns no value.
    def box(s: String) {
      val border = "-" * s.length + "--\n"
      println(border + "|" + s + "|\n" + border)
    }

    //    -----------------------
    //    |Allow me to interject|
    //    -----------------------
    box("Allow me to interject")

    // some people prefer to use an explicit return type
    def explicitBox(s: String): Unit = {
      // Some stuff
    }


  }
}
