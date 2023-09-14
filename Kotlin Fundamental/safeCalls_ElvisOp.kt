fun main () {
  // val text: String? = null
  println(text?.length ?: "Text is null")

  println("-----------------")

  // val text: String? = null
  // val textLength = text?.length ?: 7
  println(textLength)

  println("-----------------")

  val text: String? = null
  val textLength = text!!.length
  println(textLength)
}