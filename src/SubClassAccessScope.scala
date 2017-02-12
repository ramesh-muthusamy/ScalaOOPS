import scala.collection.mutable.ArrayBuffer

class Graph{
  class Member(val name: String){
    val contacts = new ArrayBuffer[Member]
  }
  private val members = new ArrayBuffer[Member]
  def join(name: String) =
  {
    val	m = new Member(name)
    members +=m
    m
  }
}


object DemoGraph extends App {
  val chatter = new Graph
  val mFace= new Graph
  val fred= chatter.join("Fred")
  val Wilma = chatter.join("Wilma")
  fred.contacts+= Wilma
  val barney = mFace.join("Barney")
  //fred.contacts+= barney //Error!
}