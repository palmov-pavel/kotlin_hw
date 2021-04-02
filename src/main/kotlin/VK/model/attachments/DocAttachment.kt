package VK.model.attachments

class DocAttachment(
    val id: Int,
    val owner_id: Int,
    val title:String,
    val size:Int,
    val ext:String,
    val url:String,
    val date: Int,
    val type: Int,
    val preview : ObjectType?
) : ObjectType {

    override fun toString(): String {
        return "id = " + id + ", title = " + title
    }

}