class NamedShape(var name: String) {
    var numberOfSides: Int = 0

    def simpleDescription(): String = {
        return s"A shape with $numberOfSides sides."
    }
}

class Square(var sideLength: Double, name: String)
    extends NamedShape(name) {
    def area(): Double = {
        return sideLength * sideLength
    }

    def Square(sideLength: Double, name: String) = {
        this.sideLength = sideLength
        numberOfSides = 4
    }

    override def simpleDescription(): String = {
        return s"A square with sides of length $sideLength."
    }
}

val test = new Square(5.2, "my test square")
test.area()
test.simpleDescription()
