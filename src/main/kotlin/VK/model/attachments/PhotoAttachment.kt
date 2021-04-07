package VK.model.attachments

class PhotoAttachment(
    override val type: AttachementType = AttachementType.photo,
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val width: Int,
    val height: Int
) : Attachment {

    override fun toString(): String {
        return "{type = $type, id = $id, text = $text}"
    }
}
