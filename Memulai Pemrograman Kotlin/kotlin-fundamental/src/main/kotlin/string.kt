fun main() {
  // String
  val text = "Kotlin"
  val firstChar = text[0]

  println("First character of $text is $firstChar")

  for (char in text) {
    print(("$char "))
  }

  println(" ")

  val statement = "Kotlin is \"Awesome!\""

  println(statement)
  /*
  \t: menambah tab ke dalam teks.

  \n: membuat baris baru di dalam teks.

  \’: menambah karakter single quote kedalam teks.

  \”: menambah karakter double quote kedalam teks.

  \\: menambah karakter backslash kedalam teks.
  */
  println(" ")

  // Unicode
  val name = "Unicode test: \u00A9"
  println(name)

  println(" ")

  // Raw String
  val line = "Line 1\n" + "Line 2\n" + "Line 3\n" + "Line 4\n" + "Line 5\n"
  val line2 =
      """
        Line 1
        Line 2
        Line 3
        Line 4
        Line 5
    """.trimIndent()
  print(line2)

  println(" ")
}
