object UnoPlayingField {
  def displayField(discardTop: String, playerHands: String): String = {
    val separator = "=" * 36 // 36 equals signs for the top and bottom separator
    val title = "                UNO"

    s"""
       |$separator
       |$title
       |$separator
       |
       |$discardTop
       |
       |$playerHands
       |
       |$separator
  """.stripMargin
  }

  def main(args: Array[String]): Unit = {
    // Example variables
    val discardTop = "Discard Top Card: [Red 5]"
    val playerHands = """Player 1 Hand: [Red 1, Blue 3, Green 7]
                        |Player 2 Hand: [Yellow 2, Blue 5]""".stripMargin

    // Display the playing field
    println(displayField(discardTop, playerHands))
  }
}