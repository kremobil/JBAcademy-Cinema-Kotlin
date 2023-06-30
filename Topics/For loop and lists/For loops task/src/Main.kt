import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val list: MutableList<Int> = MutableList(scanner.nextInt()) {scanner.nextInt()}
    val check: MutableList<Int> = MutableList(2) {scanner.nextInt()}
    println(if(list.containsAll(check)) "YES" else "NO")
}