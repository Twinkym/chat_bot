fun main() {
    val range1 = readln().toInt()..readln().toInt()
    val range2 = readln().toInt()..readln().toInt()
    val comparable = readln().toInt()
    print(comparable in range1 || comparable in range2)
}