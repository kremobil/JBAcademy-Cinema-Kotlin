fun main(args: Array<String>) {
    val list: MutableList<Int> = MutableList(readln().toInt()) { readln().toInt() }
    val movedList: MutableList<Int> = mutableListOf(list.last())
    repeat(list.size - 1) {
        movedList += list[it]
    }
    println(movedList.joinToString(" "))
}
