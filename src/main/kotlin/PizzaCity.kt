abstract class PizzaCity(
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double,
    val sicilianPizzaPrice: Double, val typoleanPizzaPrice: Double
) {
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var typoleanPizzaCount = 0
    var checkCount = 0
    var cofeCount = 0

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun typoleanPizzaSale()
    fun showChek(){
        val money_ch = checkCount * 50
        println("Вам будет скидка $money_ch рублей с покупки")
    }
    fun cofeChek(){
        val money_cof = cofeCount * 200
        println("Общая сумма выручки за кофе = $money_cof")
    }
    fun showStatistics(city: String){
        println("Проданно сицилийской пиццы: $sicilianPizzaCount")
        println("Проданно неаполианской пиццы: $neapolitanPizzaCount")
        println("Проданно римской пиццы: $romanPizzaCount")
        println("Проданно тирольской пиццы: $typoleanPizzaCount")

        val money = sicilianPizzaCount * sicilianPizzaPrice + neapolitanPizzaCount * neapolitanPizzaPrice +
                romanPizzaCount * romanPizzaPrice + typoleanPizzaCount * typoleanPizzaPrice

        if (city == "2")cofeChek()
        println("Всего заработано денег: $money")
    }
}