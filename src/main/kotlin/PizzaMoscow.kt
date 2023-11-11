class PizzaMoscow(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, typoleanPizzaPrice: Double
): PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice, sicilianPizzaPrice, typoleanPizzaPrice
), ChekPhoto {
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

        override fun neapolitanPizzaSale() {
            neapolitanPizzaCount++
            println("Спасибо за покупку неаполитанской пиццы в Москве")
        }

        override fun romanPizzaSale() {
            romanPizzaCount++
            println("Спасибо за покупку римской пиццы в Москве")
        }

        override fun sicilianPizzaSale() {
            romanPizzaCount++
            println("Спасибо за покупку сицилийской пиццы в Москве")
        }

        override fun typoleanPizzaSale() {
            typoleanPizzaCount++
            println("Спасибо за покупку тирольской пиццы в Москве")
        }
    }