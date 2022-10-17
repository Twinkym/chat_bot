fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val comparator = readln().toInt()
    print(comparator in a..b && comparator in c..d)
}