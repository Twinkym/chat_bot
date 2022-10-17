fun main() {
    val days = readln().toInt()
    val foodBudgetByDay = readln().toInt()
    val oneWayCost = readln().toInt()
    val oneNightHotel = readln().toInt()
    val totalNights = oneNightHotel * (days - 1)
    val flight = oneWayCost * 2
    val sum = days * foodBudgetByDay + totalNights + flight
    print(sum)
}