
object Rectangle {

  def main(args: Array[String]) {
    val rect = new Rectangle(new Point(1, 2), new Point(3, 4))
    println(rect.width)
  }

  class Point(val x: Int, val y: Int)

  trait Rectangular {
    val X: Point
    val Y: Point

    def left = X.x

    def right = Y.x

    def width = right - left
  }


  class Rectangle(val X: Point, val Y: Point) extends Rectangular


}