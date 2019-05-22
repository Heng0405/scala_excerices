
object perimeterSolution extends App{
 
  
  class Point(val x: Double, val y: Double){
    override def toString = {
      "("+x +","+y+")"
    }
  }
    
    def distance(p1:Point,p2:Point): Double = {
      var (x1,y1) = (p1.x,p1.y)
      var (x2,y2) = (p2.x,p2.y)
      var xDif = x2 - x1
      var yDif = y2 - y1
      return Math.sqrt(xDif*xDif + yDif*yDif)
    }

      
  def perimeter (points: List[Point]) : Double = {
    def step (p0 : Point, points: List[Point], acc: Double) : Double = points match {
      case Nil => acc
      case p :: Nil => acc + distance(p,p0)
      case pk :: pk1 :: ps => step(p0, pk1 :: ps, acc + distance (pk,pk1))
    }
    step(points.head, points, 0.0)
  }
  

      
     
       var p1 = new Point(0,0)
       var p2 = new Point(0,1)
       var p3 = new Point(1,1)
       var p4 = new Point(1,0)
    
       var points = p1::p2::p3::p4::Nil
    
       println("test-----------------"+perimeter(points))
  

}