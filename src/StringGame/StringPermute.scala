package src.StringGame

object StringPermute extends App {
  var t = Console.readInt

  var a = Console.readLine
  var n = a.length()

  var out = new StringBuilder
  for (i <- 0 until n / 2) {
    out += a.charAt(2 * i + 1)
    out += a.charAt(2 * i)
  }
  println(out)
}