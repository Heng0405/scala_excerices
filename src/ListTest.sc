object ListTest {

  val nums = 1::2::4::Nil                         //> nums  : List[Int] = List(1, 2, 4)
  val nums2 = 3::4::1::0::Nil                     //> nums2  : List[Int] = List(3, 4, 1, 0)

  def insert(x: Int, xs: List[Int]): List[Int] =
    if (xs.isEmpty || x <= xs.head)  x :: xs
    else xs.head :: insert(x,xs.tail)         //> insert: (x: Int, xs: List[Int])List[Int]

  insert(3,nums)                          //> res0: List[Int] = List(1, 2, 3, 4)


  def isort(xs: List[Int]): List[Int] =
    if(xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))
  //> isort: (xs: List[Int])List[Int]
  val nums3 = isort(nums2)                      //> nums3  : List[Int] = List(0, 1, 3, 4)

  val conList = nums ::: nums3            //> conList  : List[Int] = List(1, 2, 4, 0, 1, 3, 4)

  conList take 3                                //> res1: List[Int] = List(1, 2, 4)


  val chars = List("one","two","three","four")   //> chars  : List[String] = List(one, two, three, four)
  nums.zip(chars)                                //> res2: List[(Int, String)] = List((1,one), (2,two), (4,three))

  nums.mkString



}