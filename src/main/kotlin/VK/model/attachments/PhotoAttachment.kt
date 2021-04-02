package VK.model.attachments

class PhotoAttachment(
    val id: Int,
    val album_id: Int,
    val owner_id: Int,
    val user_id: Int,
    val text: String,
    val date: Int,
    val width: Int,
    val height: Int
) : ObjectType {

    override fun toString(): String {
        return "id = " + id + ", text = " + text
    }
}
