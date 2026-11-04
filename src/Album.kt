class Album(val songs: List<Song>): Music {

    fun getSongsByArtist(artist: String): List<Song> {
        return songs.filter { it.artist == artist }
    }

    override fun getPlayingTime(): Double {
        return songs.sumOf { it.playingTime }
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }


}