import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    do {
        println(sc.next().first().isDigit())
    } while (sc.hasNext())
}