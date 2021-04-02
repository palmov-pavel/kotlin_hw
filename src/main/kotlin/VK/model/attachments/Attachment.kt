package VK.model.attachments

class Attachment (
    val type : AttachementType,
    val obj : ObjectType) {

    override fun toString(): String {
            return (" {objType = " + type + ", " + obj.toString() + "}")
        }


}