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
    var currentPizzaSity: PizzaSity
    while (true) {
        println("Добрый день! Выберите город")
        println("1.Москва\n2.Санкт-Петербург\n")

        currentPizzaSity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "0" -> break
            else -> {
                println("ERROR")
                exitProcess(1)
            }
        }

        println("Выберите пиццу:")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца")
        when (readln()) {
            "1" -> currentPizzaSity.neapolitanPizzaSale()
            "2" -> currentPizzaSity.romanPizzaSale()
            "3" -> currentPizzaSity.sicilianPizzaSale()
            "4" -> currentPizzaSity.typoleanPizzaSale()

            else -> {
                println("ERROR")
                exitProcess(1)
            }
        }

        when (currentPizzaSity) {
            is ChekPhoto -> pizzaMoscow.showCheckPhoto()
            else -> pizzaPeter.drinkSale()
        }
    }
}