abstract class PizzaSity(
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double
    val sicilianPizzaPrice: Double, val typoleanPizzaPrice: Double)
{
    var neapolitanPizzaPrice = 0
    var romanPizzaPrice = 0
    var sicilianPizzaPrice = 0
    var typoleanPizzaPrice = 0

    abstract fun neapolitanPizzaPrice()
    abstract fun romanPizzaPrice()
    abstract fun sicilianPizzaPrice()
    abstract fun typoleanPizzaPrice()
    fun showStatistics(){
        println("Проданно сицилийской пиццы: $sicilianPizzaCount")
        println("Проданно неаполианской пиццы: $neapolitanPizzaCount")
        println("Проданно римской пиццы: $romanPizzaCount")
        println("Проданно тирольской пиццы: $typoleanPizzaCount")

        val money = sicilianPizzaCount * sicilianPizzaPrice + neapolitanPizzaCount * neapolitanPizzaPrice +
                romanPizzaCount * romanPizzaPrice + typoleanPizzaCount * typoleanPizzaPrice
        println("Всего заработано денег: $money")
    }
}