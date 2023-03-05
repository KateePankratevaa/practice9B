package autobase

class Reic(val reic: Int, val vod: String, val auto: String) {
    fun Tostring(): String {
        return "Рейс № $reic назначенный водитель $vod, назначенный автомобиль $auto"
    }
}