object Extensions {
    implicit class DoubleUnit(d: Double) {
        def km: Double = { return d * 1000.0 }
        def m: Double = { return d }
        def cm: Double = { return d / 100.0 }
        def mm: Double = { return d / 1000.0 }
        def ft: Double = { return d / 3.28084 }
    }
}

import Extensions.DoubleUnit

val oneInch = 25.4.mm
println(s"One inch is $oneInch meters")
// prints "One inch is 0.0254 meters"
val threeFeet = 3.ft
println(s"Three feet is $threeFeet meters")
// prints "Three feet is 0.914399970739201 meters"
