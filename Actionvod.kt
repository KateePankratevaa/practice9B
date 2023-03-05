package autobase

open class Actionvod(val remont: String, done: String, sostoyanieauto: Double, auto: String): Zayavka(remont, done, auto)
{
    override fun Tostring(): String{
        return "Рейс $reicNumber Водитель $voditel Автомобиль $auto"
    }
    override var exists = false

    fun ZayavkaR():Boolean {
        exists = true
        println("Заявки нет")
        return true
    }

    fun ZayavkaY(): Boolean {
        exists = false
        println("Заявка принята")
        return false
    }
}
