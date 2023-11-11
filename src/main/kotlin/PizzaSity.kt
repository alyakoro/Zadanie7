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
        println("$sicilianPizzaCount")
        println("$neapolitanPizzaCount")
        println("$romanPizzaCount")
        println("$typoleanPizzaCount")
    }
}