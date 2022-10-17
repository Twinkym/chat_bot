fun main() {
    val firstChar = readln().first()
    val secondChar = readln().first()
    val thirdChar = readln().first()
    println(
        firstChar < secondChar && firstChar < thirdChar && firstChar + 1 == secondChar && secondChar + 1 == thirdChar
    )
}
