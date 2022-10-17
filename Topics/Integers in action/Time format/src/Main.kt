fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // don't change this line
    val minute = totalSeconds / 3600
    val hour = totalSeconds % 3600 / 60
    val day = totalSeconds % 3600 % 60
    print("$day:$hour:$minute")
}