import scala.collection.immutable.Nil

object Isort{

  def isort(xs: List[Int]): List[Int] = {
    if(xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))
  }

  def insert(h:Int, xs:List[Int]):List[Int]={
    if(xs.isEmpty||h<xs.head)
      h::xs
    else
      xs.head::insert(h, xs.tail)

  }

  def main(args:Array[String])={
    val tl = 5 :: 1 :: 3 :: 9 :: 0 :: -1 :: 99::Nil
    val res = isort(tl)
    println(res.mkString(" "))
    print(tl.mkString(" "))


  }


}