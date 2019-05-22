package src.StringGame

object StringSolution extends App {

    var p = scala.io.StdIn.readLine
    var q = scala.io.StdIn.readLine

    var out = new StringBuilder

    for(i <- 0 to p.length - 1){
      out += p.charAt(i)
      out += q.charAt(i)
    }
    println(out)

}
