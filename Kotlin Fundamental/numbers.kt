fun main () {
  // Int 32 bit
  // val intNumber = 100

  // Long 64 bit
  // val longNumber: Long = 100
  // val longNumber = 100L

  // short 16 bit
  // val shortNumber: Short = 10

  // byte 8 bit
  // val byteNumber = 0b11010010

  // Double 64 bit
  // val doubleNumber: Double = 1.3

  // Float 32 bit
  // val floatNumber: Float = 1.123456789f // yang terbaca hanya 0.1234567
  
  println("-----------------")
  val maxInt = Int.MAX_VALUE
  val minInt = Int.MIN_VALUE

  println(maxInt)
  println(minInt)

  println("-----------------")

  val numberOne = 1
  val numberTwo = 2

  println(numberOne + numberTwo)

  println("-----------------")

  val numberOnee: Int = 27
  val numberTwoo: Int = 10

  println(numberOnee / numberTwoo)

  println("-----------------")

  print(5 + 4 * 4)

  println("-----------------")

  // val byteNumber: Byte = 1
  // val intNumber: Int = byteNumber

  println("-----------------")

  val stringNumber = "23"
  val intNumber = 3

  println(intNumber + stringNumber.toInt())

  println("-----------------")

  val readableNumber = 1_000_000
  println(readableNumber)
}