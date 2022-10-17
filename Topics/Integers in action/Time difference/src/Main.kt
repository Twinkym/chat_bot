const val HOURS = 60 * 60
const val MINUTES = 60
fun main() {
    val hour1 = readln().toInt()
    val minutes1 = readln().toInt()
    val seconds1 = readln().toInt()
    val hour2 = readln().toInt()
    val minutes2 = readln().toInt()
    val seconds2 = readln().toInt()
    val firstTime = hour1 * HOURS + minutes1 * MINUTES + seconds1
    val secondTime = hour2 * HOURS + minutes2 * MINUTES + seconds2
    print(secondTime - firstTime)
}