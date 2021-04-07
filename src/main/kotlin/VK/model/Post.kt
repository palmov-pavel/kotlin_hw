package VK.model

import VK.model.comments.Comment
import VK.model.attachments.Attachment

data class Post(
    val id: Int,
    val ownerID: Int,
    val formID: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comment?,
    val copyright: String,
    val likes: Like,
    val reposts: Repost,
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
