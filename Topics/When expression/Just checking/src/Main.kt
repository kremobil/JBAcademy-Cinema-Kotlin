fun main() {
    println(
        when (readln()) {
            "2" -> "Yes!"
            "1", "3", "4" -> "No!"
            else -> "Unknown number"
        }
    )
}