import kotlin.system.exitProcess
fun main() {
    println("Добрый день! Выберите город")
    println("1.Москва\n2.Санкт-Петербург\n")

    val city = readln()
    if (city == "1"){

    } else if (city == "2"){

    }else{
        println("ERROR")
        exitProcess(1)
    }
}