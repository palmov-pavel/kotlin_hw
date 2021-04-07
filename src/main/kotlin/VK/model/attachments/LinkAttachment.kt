package VK.model.attachments

import javax.swing.AbstractButton

class LinkAttachment(
    override val type: AttachementType = AttachementType.link,
    val url: String,
    val title: String,
    val caption: String,
    val description: String,
    val photo: PhotoAttachment?,
    val product: ObjectType?,
    val button: ObjectType?,
    val previewPage: String?,
    val previewUrl: String?
) : Attachment {

    override fun toString(): String {
        return "{type = $type, url = $url, title = $title}"
    }

}