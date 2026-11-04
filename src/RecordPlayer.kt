class RecordPlayer {
    fun Play(music: Music) {
        println("Playing Music")
        println("Total Playing Time: ${music.getPlayingTime()} Seconds")

        music.getAllSongs().forEach { song ->
            println("Song: ${song.title} by: ${song.artist}")
            println("Playing Time: ${song.playingTime} Seconds")
        }
    }
}