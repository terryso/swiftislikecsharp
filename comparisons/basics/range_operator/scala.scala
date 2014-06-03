val names = Array("Anna", "Alex", "Brian", "Jack")
val count = names.length
for (i <- 0 until count) {
    println(s"Person ${i + 1} is called ${names(i)}")
}
// Person 1 is called Anna
// Person 2 is called Alex
// Person 3 is called Brian
// Person 4 is called Jack
