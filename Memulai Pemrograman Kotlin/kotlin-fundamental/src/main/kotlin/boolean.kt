fun main() {
  // Boolean
  // Conjuction atau AND (&&)
  val officeOpen = 7
  val oficeClosed = 16
  val noww = 20

  val isOpen =
      if (noww >= officeOpen && noww <= oficeClosed) {
        true
      } else {
        false
      }
  print("Office is open : $isOpen")

  val isOpen = noww >= officeOpen && noww <= oficeClosed
  print("Office is open : $isOpen")

  // Disjunction atau OR (||)

  val officeOpen = 7
  val oficeClosed = 16
  val noww = 20
}
