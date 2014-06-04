class NamedShape(var name: String) {
    var numberOfSides: Int = 0

    def simpleDescription() = s"A shape with $numberOfSides sides."
}

class Square(var sideLength: Double, name: String)
    extends NamedShape(name) {
    
    numberOfSides = 4
    
    def area() = sideLength * sideLength

    override def simpleDescription() = s"A square with sides of length $sideLength."
}

val test = new Square(5.2, "my test square")
test.area()
test.simpleDescription()
