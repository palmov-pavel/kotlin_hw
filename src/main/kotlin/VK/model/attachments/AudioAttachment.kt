package VK.model.attachments

import java.time.Duration

class AudioAttachment(
    override val type: AttachementType = AttachementType.audio,
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsID: Int,
    val albumId: Int,
    val genreID: Int,
    val date: Int,
    val noSearch: Boolean,
    val isHQ: Boolean
) : Attachment {

    override fun toString(): String {
        return "{type = $type, id = $id, title = $title}"
    }
}