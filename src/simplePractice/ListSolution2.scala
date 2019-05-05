package simplePractice



object ListSolution2 extends App {
  
   val nums = 1::2::4::5::6::3::Nil   

   
   
   def f(arr:List[Int]):List[Int] = arr match {
     case odd :: Nil => Nil
     case odd :: even :: Nil => even :: Nil
     case odd :: even :: tail => even :: f(tail)
     
   }
  //println(f(nums)) 
  

  
   def less(delim:Int,arr:List[Int]):List[Int] = 
     arr.filter(a => a < delim)   
     //println(less(5,nums)) 
     
   def less2(delim: Int,arr: List[Int]): List[Int] = {
     def pred(n:Int): Boolean = {
       if(n < delim) true
       else false 
     }
     return arr.filter(pred)
   }
   //println(less2(5,nums)) 
   
   
    def printList(num:Int) : List[Int] = {
        val list = List.range(0,num)
        return list
    }
   //println(printList(5))
    
    def sumOdds(arr:List[Int]):Int = arr match {
      case head::Nil => if(head%2 == 1) head else 0
      case head::tail => if(head%2 ==1) head + sumOdds(tail) else sumOdds(tail)
    }
    
    
    def sumOdds2(arr:List[Int]): Int =  {
      var result = 0
      var these = arr
      while(!these.isEmpty){
        if(these.head%2 == 1) 
          result = these.head + result
          these = these.tail
      }
      result 
    }   
     //println(sumOdds2(nums))
     
 
    def reverseList(arr: List[Int]): List[Int] = arr match {
      case head::Nil => List(head)
      case head :: tail => reverseList(tail) ::: List(head)
     
    } 
    println(reverseList(nums))
      
      
  
}