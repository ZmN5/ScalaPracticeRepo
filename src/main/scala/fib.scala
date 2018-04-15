
object fib{
  def fib(a:Int, b:Int):Stream[Int] = Stream.cons(a, fib(b, a+b))

  def fib2(a:Int, b:Int):Stream[Int] = a #:: fib2(b, a+b)

  def main(args: Array[String]): Unit = {
    val res = fib2(0,1).take(10000000)
    print(res.last)

  }
}