package VK.model.attachments

class PhotoAttachment(
    override val objType: AttachementType = AttachementType.photo,
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
        return "{type = $objType, id = $id, text = $text}"
    }
}
