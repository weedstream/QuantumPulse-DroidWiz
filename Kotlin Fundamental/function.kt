fun main() {
  // Function
  val user = setUser("Fauzi", 20)
  println(user)
  printUser("Fauzi")

  print(" ")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}