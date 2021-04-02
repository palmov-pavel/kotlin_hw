package VK.model.attachments

import java.time.Duration

class AudioAttachment(
    val id: Int,
    val owner_id: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsID: Int,
    val album_id: Int,
    val genreID: Int,
    val date: Int,
    val noSearch: Boolean,
    val isHQ: Boolean
) : ObjectType {

    override fun toString(): String {
        return "id = " + id + ", title = " + title
    }
}