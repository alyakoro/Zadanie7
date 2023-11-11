class PizzaPeter (
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double
    val sicilianPizzaPrice: Double, val typoleanPizzaPrice: Double
    ): PizzaSity(
        neapolitanPizzaPrice, romanPizzaPrice, sicilianPizzaPrice, typoleanPizzaPrice
    ), Drink {

    override fun drinkSale() {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        if (readln() == "1") println("С вас 200 рублей")
    }
    override fun neapolitanPizzaPrice() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Санкт - Петербурге")
    }

    override fun romanPizzaPrice() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Санкт - Петербурге")
    }

    override fun sicilianPizzaPrice() {
        romanPizzaCount++
        println("Спасиюо за покупку сицилийской пиццы в Санкт - Петербурге")
    }

    override fun typoleanPizzaPrice() {
        typoleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Санкт - Петербурге")
    }
}