class PrivateDuck{
  private var privateAge=0
  def age= privateAge//getter
  def age_= (newAge: Int) {if (newAge> privateAge) privateAge= newAge; }//setter
}


object PrivDuckDemo extends App {
  var f = new PrivateDuck
  //f.size= 10 // It calls f.size_=(10)
  f.age_=(-10) // It calls f.size_=(10)
  println(f.age) // It calls f.size()
}