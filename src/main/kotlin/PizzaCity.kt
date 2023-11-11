abstract class PizzaCity(
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double,
    val sicilianPizzaPrice: Double, val typoleanPizzaPrice: Double
) {
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var typoleanPizzaCount = 0

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun typoleanPizzaSale()
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