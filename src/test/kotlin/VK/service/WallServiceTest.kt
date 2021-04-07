package VK.service

import VK.model.attachments.AttachementType
import VK.model.attachments.LinkAttachment
import VK.model.comments.Comment
import VK.model.Like
import VK.model.Post
import VK.model.Repost
import VK.model.attachments.Attachment
import VK.model.comments.Donut
import VK.model.comments.Thread
import VK.model.myExceptions.PostNotFoundException


import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {

        // arrange
        var Wall = WallService()

        val mainPost = Post(
            id = 0,
            ownerID = 2,
            formID = 3,
            createdBy = 4,
            date = 6,
            text = "мой первый пост VK",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = null,
            copyright = "xxx",
            likes = Like(),
            reposts = Repost(),
            postType = "xxx",
            valSignerID = 1,
            camPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            postponedID = 1,
            attachments = arrayOf(null)
        )

        // act
        val result = Wall.add(mainPost);

        // assert
        assertEquals(1, result.id)

    }

    @Test
    fun update_positive() {

        // arrange
        var Wall = WallService()

        val mainPost = Post(
            id = 0,
            ownerID = 2,
            formID = 3,
            createdBy = 4,
            date = 6,
            text = "мой первый пост VK",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = null,
            copyright = "xxx",
            likes = Like(),
            reposts = Repost(),
            postType = "xxx",
            valSignerID = 1,
            camPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            postponedID = 1,
            attachments = arrayOf(null)
        )

        val updateMainPost = Post(
            id = 1,
            ownerID = 2,
            formID = 3,
            createdBy = 4,
            date = 6,
            text = "VK",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = null,
            copyright = "xxx2",
            likes = Like(),
            reposts = Repost(),
            postType = "xxx2",
            valSignerID = 1,
            camPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            postponedID = 1,
            attachments = arrayOf(null)
        )

        val mainPostOnWall = Wall.add(mainPost);


        // act
        val result = Wall.update(updateMainPost);

        // assert
        assertTrue(result)

    }

    @Test
    fun update_negative() {

        // arrange
        var Wall = WallService()

        val mainPost = Post(
            id = 0,
            ownerID = 2,
            formID = 3,
            createdBy = 4,
            date = 6,
            text = "мой первый пост VK",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = null,
            copyright = "xxx",
            likes = Like(),
            reposts = Repost(),
            postType = "xxx",
            valSignerID = 1,
            camPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            postponedID = 1,
            attachments = arrayOf(null)
        )

        val updateMainPost = Post(
            id = 2,
            ownerID = 2,
            formID = 3,
            createdBy = 4,
            date = 6,
            text = "VK",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = null,
            copyright = "xxx2",
            likes = Like(),
            reposts = Repost(),
            postType = "xxx2",
            valSignerID = 1,
            camPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            postponedID = 1,
            attachments = arrayOf(null)
        )

        val mainPostOnWall = Wall.add(mainPost);


        // act
        val result = Wall.update(updateMainPost);

        // assert
        assertFalse(result)

    }

    @Test
    fun addAttachment_positive() {

        // arrange
        var Wall = WallService()
        val link1: LinkAttachment = LinkAttachment(AttachementType.link,"http:\\abc.ru", "ABC", "abc", "xxx", null, null, null, null, null)

        val mainPost = Post(
            id = 1,
            ownerID = 2,
            formID = 3,
            createdBy = 4,
            date = 6,
            text = "мой первый пост VK",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = null,
            copyright = "xxx",
            likes = Like(),
            reposts = Repost(),
            postType = "xxx",
            valSignerID = 1,
            camPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            postponedID = 1,
            attachments = arrayOf(null)
        )

        val mainPostOnWall = Wall.add(mainPost);


        // act
        val result = Wall.addAttachment(mainPostOnWall, link1)

        // assert
        assertTrue(result)

    }

    @Test
    fun createComment_positive() {
        var wall = WallService()
        val mainPost = Post(
            id = 1,
            ownerID = 2,
            formID = 3,
            createdBy = 4,
            date = 6,
            text = "мой первый пост VK",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = null,
            copyright = "xxx",
            likes = Like(),
            reposts = Repost(),
            postType = "xxx",
            valSignerID = 1,
            camPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            postponedID = 1,
            attachments = arrayOf(null)
        )
        val comment = Comment(1,1,1,"Hello", null, 1, 1, arrayOf(null), arrayOf(null), null)
        val mainPostOnWall = wall.add(mainPost);

        wall.createComment(2,1,0,null,1,arrayOf(null), 1, "1abc", comment)


    }

   @Test(expected = PostNotFoundException::class)
    fun createComment_shouldThrow() {
        var wall = WallService()
        val comment = Comment(1,1,1,"Hello", null, 1, 1, arrayOf(null), arrayOf(null), null)

        wall.createComment(1,1,0,null,1,arrayOf(null), 1, "1abc", comment)
    }
}