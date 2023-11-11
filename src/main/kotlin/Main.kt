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
        fun selectAddService(currentPizzaSity:PizzaCity) {
            when (currentPizzaSity) {
                is ChekPhoto -> pizzaMoscow.showCheckPhoto()
                is Drink -> currentPizzaSity.drinkSale()
            }
        }
        println("Выберите пиццу:")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца\n 0. Показать статистику")
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
            "0" -> currentPizzaSity.showStatistics()

            else -> {
                println("ERROR")
                exitProcess(1)
            }
        }


    }
}