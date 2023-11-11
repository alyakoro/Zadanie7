class PizzaMoscow (
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double
    val sicilianPizzaPrice: Double, val typoleanPizzaPrice: Double
): PizzaSity(
    neapolitanPizzaPrice, romanPizzaPrice, sicilianPizzaPrice, typoleanPizzaPrice
), ChekPhoto {
    override fun ChekPhoto() {
        println("Вы фотография чека?")
        println("1. Да\n2. Нет")
        if (readln() == "1") println("Вам будет скидка 50 рублей с покупки")
    }


        override fun neapolitanPizzaPrice() {
            neapolitanPizzaCount++
            println("Спасибо за покупку неаполитанской пиццы в Москве")
        }

        override fun romanPizzaPrice() {
            romanPizzaCount++
            println("Спасибо за покупку римской пиццы в Москве")
        }

        override fun sicilianPizzaPrice() {
            romanPizzaCount++
            println("Спасибо за покупку сицилийской пиццы в Москве")
        }

        override fun typoleanPizzaPrice() {
            typoleanPizzaCount++
            println("Спасибо за покупку тирольской пиццы в Москве")
        }
    }