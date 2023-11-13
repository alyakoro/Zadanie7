class PizzaAbak (
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, typoleanPizzaPrice: Double
): PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice, sicilianPizzaPrice, typoleanPizzaPrice
), Drink, ChekPhoto, souse {
    override fun drinkSale(i: Int) {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            num_coff += "$i"
            cofeCount++
            println("С вас 200 рублей")
        }
        all_c++
    }
    override fun showCheckPhoto() {
        println("У вас есть фотография чека?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            checkCount++
            println("Всего чеков: $checkCount")
            showChek()
        }
        all_ch++
    }
    override fun sousemake() {
        println("Хотите соус?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            println("1. - Кетчуп\n2. - Майонез")
            when (readln()) {
                "1" -> {
                    souseCountkek++
                    println("С вас 25 рублей")
                }

                "2" -> {
                    souseCountmas++
                    println("С вас 20 рублей")
                }
            }
        }
    }
    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Абакане")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Абакане")
    }

    override fun sicilianPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Абакане")
    }

    override fun typoleanPizzaSale() {
        typoleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Абакане")
    }
}