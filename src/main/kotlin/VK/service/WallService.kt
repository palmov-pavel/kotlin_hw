package VK.service

import VK.model.attachments.*
import VK.model.comment
import VK.model.like
import VK.model.post
import VK.model.repost

class WallService {
    private var posts = emptyArray<post>()
    private var uniqID = 1

    fun add(post: post): post {
        posts += post.copy(id = uniqID)
        uniqID++
        return posts.last()
    }

    fun update(updPost: post): Boolean {
        var result: Boolean = false
        for ((index, post) in posts.withIndex()) {
            if ((post.id == updPost.id) && ((post.ownerID == updPost.ownerID))) {
                posts[index] = post.copy(
                    formID = updPost.formID,
                    date = updPost.date,
                    text = updPost.text,
                    replyOwnerId = updPost.replyOwnerId,
                    replyPostId = updPost.replyPostId,
                    friendsOnly = updPost.friendsOnly,
                    comments = updPost.comments,
                    copyright = updPost.copyright,
                    likes = updPost.likes,
                    reposts = updPost.reposts,
                    postType = updPost.postType,
                    valSignerID = updPost.valSignerID,
                    camPin = updPost.camPin,
                    canDelete = updPost.canDelete,
                    canEdit = updPost.canEdit,
                    isPinned = updPost.isPinned,
                    markedAsAds = updPost.markedAsAds,
                    postponedID = updPost.postponedID
                )

                result = true
                break
            } else {
                result = false
            }
        }
        return result
    }

    fun getPost(id: Int): post? {
        var result: post? = null
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                result = post
                break
            }
            else result = null
        }

        return result
    }


    fun addAttachment(updPost: post, obj: ObjectType): Boolean {
        var attachment : Attachment? = null
        var result: Boolean = false

        when (obj) {
            is PhotoAttachment ->  attachment = Attachment (AttachementType.photo, obj)
            is AudioAttachment ->  attachment = Attachment (AttachementType.audio, obj)
            is VideoAttachment -> attachment = Attachment (AttachementType.video, obj)
            is DocAttachment -> attachment = Attachment (AttachementType.doc, obj)
            is LinkAttachment -> attachment = Attachment (AttachementType.link, obj)
            else -> attachment = Attachment (AttachementType.other, obj)
        }

        for ((index, post) in posts.withIndex()) {
            if ((post.id == updPost.id) && ((post.ownerID == updPost.ownerID))) {
                posts[index] = post.copy(attachments = post.attachments!!.plus(attachment)
                )
                result = true
                break
            } else {
                result = false
            }
        }
        return result
    }


}