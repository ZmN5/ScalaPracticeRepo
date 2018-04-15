object Queens{
  def isCheck(q1:(Int,Int), q2:(Int,Int))= q1._1==q2._1 || q1._2==q2._2|| (q1._1-q2._1).abs==(q1._2-q2._2)

  def isSafe(q: (Int, Int), queens: List[(Int, Int)])=queens.forall( q2 => !isCheck(q, q2))

  def queens(num:Int): List[List[(Int,Int)]] = {

    def pickQueens(k:Int): List[List[(Int, Int)]] ={
      if(k==0)
        List(List())
      else{
        for{
          qs <- pickQueens(k-1)
          col <- 1 to num
          q = (k, col)
          if isSafe(q, qs)
        } yield q::qs
      }
    }

  pickQueens(num)
  }

  def main(args: Array[String]): Unit = {
    val res = queens(8)
    res.foreach(println _)
  }



}