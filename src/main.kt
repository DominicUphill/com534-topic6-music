fun main() {
    val song1 = Song("Faint", "Linkin Park", 187.0)
    val song2 = Song("Numb", "Linkin Park", 132.0)
    val song3 = Song("Isolate", "Sub Urban", 132.0)
    val song4 = Song("Freak", "Sub Urban", 112.0)

    val single = Single(song1, song2)
    val album = Album(listOf(song3, song4))

    val recordPlayer = RecordPlayer()

    recordPlayer.Play(single)
    recordPlayer.Play(album)
}