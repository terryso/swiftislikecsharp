trait Nameable {
    def name(): String
}

def f[T <: Nameable](x: T) = {
    println("Name is " + x.name())
}
