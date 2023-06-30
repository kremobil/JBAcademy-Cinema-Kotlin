import java.util.*

// You can experiment here, it won’t be checked

fun main() = println(MutableList<Int>(readln().toInt()) { readln().toInt() }.also { Collections.rotate(it, 1) }.joinToString(" "))
