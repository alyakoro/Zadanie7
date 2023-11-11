import kotlin.system.exitProcess
fun main() {

    val pizzaPeter = PizzaPeter(
        neapolitanPizzaPrice = 175.3, romanPizzaPrice = 241.5,
        sicilianPizzaPrice = 167.5, typoleanPizzaPrice = 215.0
    )
    val pizzaMoscow = PizzaMoscow(
        neapolitanPizzaPrice = 215.3, romanPizzaPrice = 250.5,
        sicilianPizzaPrice = 180.5, typoleanPizzaPrice = 248.0
    )
    var currentPizzaSity: PizzaCity
    while (true) {
        println("Добрый день! Выберите город")
        println("1.Москва\n2.Санкт-Петербург\n0.Выйти из программы")

        val city = readln()
        if (city == "1"){
            currentPizzaSity = pizzaMoscow}
        else if (city == "2") {
            currentPizzaSity = pizzaPeter}
        else {
            println("ERROR")
            continue
            }

        println("Выберите пиццу:")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца\n0. Показать статистику")
        selectPizza(currentPizzaSity, city)
    }
}
private fun selectPizza(currentPizzaSity: PizzaCity, city: String) {
    when (readln()) {

        "1" -> {
            currentPizzaSity.neapolitanPizzaSale()
            selectAddService(currentPizzaSity)
        }

        "2" -> {
            currentPizzaSity.romanPizzaSale()
            selectAddService(currentPizzaSity)
        }

        "3" -> {
            currentPizzaSity.sicilianPizzaSale()
            selectAddService(currentPizzaSity)
        }

        "4" -> {
            currentPizzaSity.typoleanPizzaSale()
            selectAddService(currentPizzaSity)
        }

        "0" -> currentPizzaSity.showStatistics(city)


        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}
fun selectAddService(currentPizzaSity:PizzaCity) {
    when (currentPizzaSity) {
        is ChekPhoto -> currentPizzaSity.showCheckPhoto()
        is ChekPhoto -> currentPizzaSity.showChek()
        is Drink -> currentPizzaSity.drinkSale()
    }
}