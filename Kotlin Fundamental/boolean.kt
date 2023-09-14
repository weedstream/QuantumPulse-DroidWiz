fun main () {
  // Dicjuntion / OR ||
  val officeOpen = 7
  val officeClosed = 16
  val now = 20

  val isClose = now < officeOpen || now > officeClosed

  println("Office is closed : $isClose")

  // Negation / NOT !

  val isOpen = now > officeOpen

  if (!isOpen) {
    println("Office is closed")
  } else {
    println("Office is open")
  }
}