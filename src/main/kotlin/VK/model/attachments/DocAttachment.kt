package VK.model.attachments

class DocAttachment(
    override val objType: AttachementType = AttachementType.doc,
    val id: Int,
    val ownerId: Int,
    val title:String,
    val size:Int,
    val ext:String,
    val url:String,
    val date: Int,
    val type: Int,
    val preview : ObjectType?
) :Attachment {

    override fun toString(): String {
        return "{type = $objType, id = $id, title = $title}"
    }

}