package VK.model

import VK.model.attachments.AttachementType
import VK.model.attachments.Attachment

data class post(
    val id: Int,
    val ownerID: Int,
    val formID: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: comment,
    val copyright: String,
    val likes: like,
    val reposts: repost,
    val postType: String,
    val valSignerID: Int,
    val camPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned:Boolean,
    val markedAsAds: Boolean,
    val postponedID: Int,
    val attachments: Array<Attachment?>
)
