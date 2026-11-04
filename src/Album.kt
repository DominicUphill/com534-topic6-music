class Album(val songs: List<Song>) {
    fun getSongsByArtist(artist: String): List<Song> {
        return songs.filter { it.artist == artist }
    }
}