fun main() {
    val string = readln()
    val simbol = readln().toInt()
    print("Symbol # $simbol of the string \"$string\" is \'${string[simbol - 1]}\'")
}