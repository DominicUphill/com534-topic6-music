fun main() {
    val song1 = Song("Faint", "Linkin Park", 187.0)
    val song2 = Song("Numb", "Linkin Park", 132.0)
    val song3 = Song("Isolate", "Sub Urban", 132.0)
    val song4 = Song("Freak", "Sub Urban", 112.0)

    val single = Single(song1, song2)
    val album = Album(listOf(song3, song4))

    val musicList: List<Music> = listOf(single, album)

    musicList.forEach { Music ->
        println("Playing time: ${Music.getPlayingTime()} seconds")
        println("Songs: ${Music.getAllSongs()}")
    }
}