
class TestSbt extends Function1[Int, Int]{
  def apply(n: Int) = n+1
}


object TestSbt{

  def apply: TestSbt = new TestSbt()

  def main(args: Array[String]): Unit = {
    val plusOne = apply
    print(plusOne(9))
  }


}