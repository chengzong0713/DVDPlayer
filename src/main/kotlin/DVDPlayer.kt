class DVDPlayer (var hasRecoder: Boolean) {

    fun playDVD() {
        println("DVD playing")

    }
    fun recorderDVD() {
        if (hasRecoder) {
            println("DVD recording")
        }
    }
}

fun main(args: Array<String>) {
    val d = DVDPlayer(true)
    d.playDVD()
    d.recorderDVD()
}