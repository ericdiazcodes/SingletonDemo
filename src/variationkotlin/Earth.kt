package variationkotlin

// Just declare a singleton by using the "object" keyword.
object Earth

fun main() {
    val earth1 = Earth
    val earth2 = Earth

    // This will print out the same object reference!
    println(earth1.toString())
    println(earth2.toString())
}