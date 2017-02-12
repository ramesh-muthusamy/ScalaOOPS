case class Person(lastname: String, firstname: String, birthYear: Int)

val p = Person("Lacava", "Alessandro", 1976)

// instead if the slightly more verbose:
//val p = new Person("Lacava", "Alessandro", 1976)

val lastname = p.lastname
println(lastname)