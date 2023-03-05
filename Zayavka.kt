package autobase

open class Zayavka( val reicNumber: String, var voditel: String, var auto: String)
{
    open var exists = false
    open fun Tostring(): String {
        return "Рейс номер $reicNumber Водитель $voditel Автомобиль $auto"
    }
    fun GetReic() {
        println("Рейс номер $reicNumber")
    }
    fun Remont() {
        println("Водитель $voditel сделал заявку на ремонт автомобиля $auto")
    }
    fun Otstr(){
        exists = true
        println("Такой рейс уже существует")
    }
    fun NoOtstr(){
        exists = false
        println("Такой рейс уже существует")
    }
    fun Done(reicNumber: String, sostoyanie: String) {

        if (reicNumber == "Да") {
            println("Каково состояние вашего автомобиля?")
            sostoyanie == readLine()!!.toString()
            if (sostoyanie == "В порядке")
                return
            else
                println("Рейс завершен, сделайте заявку на ремонт")
            Remont()
        } else {
            return
        }
    }
}

