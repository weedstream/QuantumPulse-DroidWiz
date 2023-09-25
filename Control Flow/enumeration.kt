fun main () {
  // val colorRed = Color.RED
  // val colorGreen = Color.GREEN
  // val colorBlue = Color.BLUE

  // val color : Color = Color.RED
  // println(color)

  // println("-----------------")

  // val colors: Array<Color> = Color.values()
  //   colors.forEach { color ->
  //       print("$color ")
  //   }

  // println("-----------------")

  // val color: Color = Color.valueOf("RED")
  //   println("Color is $color")
  //   println("Color value is ${color.value.toString(16)}")

  val color: Color = Color.GREEN

  when(color){
    Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
    Color.GREEN -> print("Color is Green")
  }

}

// enum class Color (val value: Int) {
//   RED(0xFF0000),
//   GREEN(0x00FF00),
//   BLUE(0x0000FF)
// }

// enum class Color2 {
//   RED, GREEN, BLUE
// }

// enum class Color(val value: Int) {
//   RED(0xFF0000){
//       override fun printValue() {
//           println("value of RED is $value")
//       }
//   },
//   GREEN(0x00FF00){
//       override fun printValue() {
//           println("value of GREEN is $value")
//       }
//   },
//   BLUE(0x0000FF){
//       override fun printValue() {
//           println("value of BLUE is $value")
//       }

enum class Color(val value: Int) {
  RED(0xFF0000),
  GREEN(0x00FF00),
  BLUE(0x0000FF)
}