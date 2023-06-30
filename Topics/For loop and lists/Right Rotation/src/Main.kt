import java.util.Collections

fun main() {
    val list: MutableList<Int> = MutableList<Int>(readln().toInt()) { readln().toInt() }.also { Collections.rotate(it, readln().toInt()) }
    print(list.joinToString(" "))
}