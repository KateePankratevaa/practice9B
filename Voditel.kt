package autobase

open class Voditel(private val name: String, val addres: String, val phone: String) {
    fun Tostring(): String {
        return "Водитель $name, Адрес $addres, Номер телефона $phone"
    }
}
