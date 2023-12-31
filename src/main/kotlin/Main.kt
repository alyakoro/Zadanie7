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
    val pizzaAbakan = PizzaAbak(
        neapolitanPizzaPrice = 190.3, romanPizzaPrice = 222.5,
        sicilianPizzaPrice = 130.5, typoleanPizzaPrice = 200.0,
    )
    var currentPizzaSity: PizzaCity
    while (true) {
        println("______________________")
        println("Добрый день! Выберите город")
        println("1.Москва\n2.Санкт-Петербург\n3.Абакан\n0.Выйти из программы")

        val city = readln()
        if (city == "1"){
            currentPizzaSity = pizzaMoscow }
        else if (city == "2") {
            currentPizzaSity = pizzaPeter }
        else if (city == "3"){
            currentPizzaSity = pizzaAbakan}
        else if (city == "0"){
            exitProcess(1)
        }
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
            selectAddService(currentPizzaSity,1)
        }

        "2" -> {
            currentPizzaSity.romanPizzaSale()
            selectAddService(currentPizzaSity,2)
        }

        "3" -> {
            currentPizzaSity.sicilianPizzaSale()
            selectAddService(currentPizzaSity,3)
        }

        "4" -> {
            currentPizzaSity.typoleanPizzaSale()
            selectAddService(currentPizzaSity,4)
        }

        "0" -> currentPizzaSity.showStatistics(city)


        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}
fun selectAddService(currentPizzaSity:PizzaCity,num:Int) {
        if (currentPizzaSity is Drink)
            currentPizzaSity.drinkSale(num)
        if (currentPizzaSity is ChekPhoto)
            currentPizzaSity.showCheckPhoto()
        if (currentPizzaSity is souse)
            currentPizzaSity.sousemake()
    }