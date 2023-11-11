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
    var num_coff = listOf("")

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun typoleanPizzaSale()
    var all_c = 0
    var all_ch = 0
    fun showChek(){
        money_ch = checkCount * 50
        println("Вам будет скидка $money_ch рублей с покупки")
    }
    var pros_chek = 0.0
    fun showpross(){
        pros_chek = ((checkCount / all_ch.toDouble()) * 100)
    }
    var pros_coff = 0.0
    fun cofeChek(){
        money_cof = cofeCount * 200
        println("Общая сумма выручки за кофе = $money_cof")
        pros_coff = ((cofeCount / all_c.toDouble()) * 100)
    }
    fun chet_pizza_cofe(){
        println("Количество людей, покупающих неаполианскую пиццу с кофе: " + num_coff.count{it == "1"} + " в процентах:" + (num_coff.count{it == "1"}/cofeCount.toDouble())*100)
        println("Количество людей, покупающих римскую пиццу с кофе: " + num_coff.count{it == "2"} + " в процентах:" + (num_coff.count{it == "2"}/cofeCount.toDouble())*100)
        println("Количество людей, покупающих сицилийскую пиццу с кофе: " + num_coff.count{it == "3"} + " в процентах:" + (num_coff.count{it == "3"}/cofeCount.toDouble())*100)
        println("Количество людей, покупающих тирольскую пиццу с кофе: " + num_coff.count{it == "4"} + " в процентах:" + (num_coff.count{it == "4"}/cofeCount.toDouble())*100)
    }
    fun showStatistics(city: String){
        println("Проданно сицилийской пиццы: $sicilianPizzaCount")
        println("Проданно неаполианской пиццы: $neapolitanPizzaCount")
        println("Проданно римской пиццы: $romanPizzaCount")
        println("Проданно тирольской пиццы: $typoleanPizzaCount")


        if (city == "2"){
            cofeChek()
            println("Процент людей, покупающие кофе: $pros_coff%")
            chet_pizza_cofe()
            val money_spb = sicilianPizzaCount * sicilianPizzaPrice + neapolitanPizzaCount * neapolitanPizzaPrice +
                    romanPizzaCount * romanPizzaPrice + typoleanPizzaCount * typoleanPizzaPrice + money_cof * cofeCount
            println("Всего заработано денег: $money_spb")
        }
        else {
            showpross()
            println("Процент людей, которые показывают чек: $pros_chek%")
                val money_mos = sicilianPizzaCount * sicilianPizzaPrice + neapolitanPizzaCount * neapolitanPizzaPrice +
                        romanPizzaCount * romanPizzaPrice + typoleanPizzaCount * typoleanPizzaPrice - money_ch * checkCount
                println("Всего заработано денег: $money_mos")
        }

    }
}