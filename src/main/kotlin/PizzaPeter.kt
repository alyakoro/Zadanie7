class PizzaPeter (
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, typoleanPizzaPrice: Double
    ): PizzaCity(
        neapolitanPizzaPrice, romanPizzaPrice, sicilianPizzaPrice, typoleanPizzaPrice
    ), Drink {

    override fun drinkSale() {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        if (readln() == "1") println("С вас 200 рублей")
    }
    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Санкт - Петербурге")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Санкт - Петербурге")
    }

    override fun sicilianPizzaSale() {
        romanPizzaCount++
        println("Спасиюо за покупку сицилийской пиццы в Санкт - Петербурге")
    }

    override fun typoleanPizzaSale() {
        typoleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Санкт - Петербурге")
    }
}