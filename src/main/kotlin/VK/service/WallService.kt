package VK.service

import VK.model.attachments.*
import VK.model.comments.Comment
import VK.model.Post
import VK.model.myExceptions.PostNotFoundException

class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var uniqID = 1

    fun add(post: Post): Post {
        posts += post.copy(id = uniqID)
        uniqID++
        return posts.last()
    }

    fun update(updPost: Post): Boolean {
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

    fun getPost(id: Int): Post? {
        var result: Post? = null
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                result = post
                break
            }
            else result = null
        }

        return result
    }


    fun addAttachment(updPost: Post, obj: Attachment): Boolean {
        var result: Boolean = false

        for ((index, post) in posts.withIndex()) {
            if ((post.id == updPost.id) && ((post.ownerID == updPost.ownerID))) {
                posts[index] = post.copy(attachments = post.attachments!!.plus(obj)
                )
                result = true
                break
            } else {
                result = false
            }
        }
        return result
    }

    fun createComment(
        ownerId: Int,
        postId: Int,
        from_group: Int = 0,
        message: String?,
        replyToComment: Int,
        attachments: Array<Attachment?>,
        stickerId: Int,
        guid: String,
        comment: Comment
    ) {
        for (post in posts) {
            if (post.id == postId) {
                comments += comment
            } else throw PostNotFoundException("Пост с id=$postId не найден")
        }
    }

}