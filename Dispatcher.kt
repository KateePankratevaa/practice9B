package autobase

class Dispatcher(val name: String ,val addres:String, val phone: String)
{
    fun Tostring(): String
    {
        return "Диспетчер $name, Адрес $addres, Номер телефона $phone"
    }
    fun Zayavkaracpr (voditel: Actionvod){
        voditel.exists = true
        println("Водитель назначен на рейс")
    }
    fun UnBlockCard(card: Actionvod){
        card.exists = false
        println("Водитель еще не назначен на рейс")
    }
}