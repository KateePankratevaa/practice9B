import autobase.*

fun main() {
    val dispatcher = Dispatcher("Иванов Иван Иванович", "улица Красных Командиров 56", "89234589453")

    val reic = Reic(4567, vod = "Иванов Сергей Михайлович", auto = "Пежо")

    val zayavka = Zayavka("4567", voditel = "Иванов Сергей Михайлович", auto = "Пежо" )

    //Создаем администратора
    val voditel = Voditel("Андреев Андрей Андреевич", "ул. Первомайская 89", "89462179231")

    val zayavka2 = Zayavka("4567", voditel = "Иванов Сергей Михайлович", auto = "Пежо")

}

