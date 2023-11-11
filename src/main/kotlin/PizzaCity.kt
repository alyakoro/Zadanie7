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
    var money_ch = 0
    var money_cof = 0

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun typoleanPizzaSale()
    fun showChek(){
        money_ch = checkCount * 50
        println("Вам будет скидка $money_ch рублей с покупки")
    }
    fun cofeChek(){
        money_cof = cofeCount * 200
        println("Общая сумма выручки за кофе = $money_cof")
    }
    fun showStatistics(city: String){
        println("Проданно сицилийской пиццы: $sicilianPizzaCount")
        println("Проданно неаполианской пиццы: $neapolitanPizzaCount")
        println("Проданно римской пиццы: $romanPizzaCount")
        println("Проданно тирольской пиццы: $typoleanPizzaCount")


        if (city == "2"){
            cofeChek()
            val money_spb = sicilianPizzaCount * sicilianPizzaPrice + neapolitanPizzaCount * neapolitanPizzaPrice +
                    romanPizzaCount * romanPizzaPrice + typoleanPizzaCount * typoleanPizzaPrice + money_cof * cofeCount
            println("Всего заработано денег: $money_spb")
        }
        else {
                val money_mos = sicilianPizzaCount * sicilianPizzaPrice + neapolitanPizzaCount * neapolitanPizzaPrice +
                        romanPizzaCount * romanPizzaPrice + typoleanPizzaCount * typoleanPizzaPrice - money_ch * checkCount
                println("Всего заработано денег: $money_mos")
        }

    }
}