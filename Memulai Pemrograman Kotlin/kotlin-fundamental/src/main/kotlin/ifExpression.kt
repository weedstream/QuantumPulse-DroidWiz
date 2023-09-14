fun main() {
  // If expression
  val openHours = 7
  val now = 20
  val office: String
  if (now > openHours) {
    office = "Office already open"
  } else {
    office = "Office is closed"
  }

  print(office)

  val openHours = 7
  val now = 20
  val office: String
  office =
      if (now > openHours) {
        "Office already open"
      } else {
        "Office is closed"
      }

  print(office)

  office =
      if (now > 7) {
        "Office already open"
      } else if (now == openHours) {
        "Wait a minute, office will be open"
      } else {
        "Office is closed"
      }
  print(office)

  println(" ")
}
