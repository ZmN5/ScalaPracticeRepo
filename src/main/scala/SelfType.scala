
trait User {
  val name:String
}

trait AUser extends User{
  val name:String = "sxk"
}

trait Tweeter{
  this:User =>
  def tweet(msg: String) = println(s"$name:$msg")
}


class SelfType extends Tweeter with AUser {
  def saySelf = tweet("hahahah")
}


object SelfType extends Tweeter with  AUser {
  def main(args: Array[String]): Unit = {
    tweet("hahahh")
  }

}
