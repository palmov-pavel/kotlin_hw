package VK.model.attachments

import javax.swing.AbstractButton

class LinkAttachment(
    val url: String,
    val title: String,
    val caption: String,
    val description: String,
    val photo: PhotoAttachment?,
    val product: ObjectType?,
    val button: ObjectType?,
    val previewPage: String?,
    val previewUrl: String?
) : ObjectType {

    override fun toString(): String {
        return "url = " + url + ", title = " + title
    }

}