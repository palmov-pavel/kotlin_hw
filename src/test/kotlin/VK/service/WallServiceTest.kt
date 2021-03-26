package VK.service

import VK.model.comment
import VK.model.like
import VK.model.post
import VK.model.repost
import network_activity.MinutesToText
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {

        // arrange
        var Wall = WallService()

        val mainPost = post(
            id = 0,
            ownerID = 2,
            formID = 3,
            createdBy = 4,
            date = 6,
            text = "мой первый пост VK",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = comment(),
            copyright = "xxx",
            likes = like(),
            reposts = repost(),
            postType = "xxx",
            valSignerID = 1,
            camPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            postponedID = 1
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

        val mainPost = post(
            id = 0,
            ownerID = 2,
            formID = 3,
            createdBy = 4,
            date = 6,
            text = "мой первый пост VK",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = comment(),
            copyright = "xxx",
            likes = like(),
            reposts = repost(),
            postType = "xxx",
            valSignerID = 1,
            camPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            postponedID = 1
        )

        val updateMainPost = post(
            id = 1,
            ownerID = 2,
            formID = 3,
            createdBy = 4,
            date = 6,
            text = "VK",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = comment(),
            copyright = "xxx2",
            likes = like(),
            reposts = repost(),
            postType = "xxx2",
            valSignerID = 1,
            camPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            postponedID = 1
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

        val mainPost = post(
            id = 0,
            ownerID = 2,
            formID = 3,
            createdBy = 4,
            date = 6,
            text = "мой первый пост VK",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = comment(),
            copyright = "xxx",
            likes = like(),
            reposts = repost(),
            postType = "xxx",
            valSignerID = 1,
            camPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            postponedID = 1
        )

        val updateMainPost = post(
            id = 2,
            ownerID = 2,
            formID = 3,
            createdBy = 4,
            date = 6,
            text = "VK",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = comment(),
            copyright = "xxx2",
            likes = like(),
            reposts = repost(),
            postType = "xxx2",
            valSignerID = 1,
            camPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            postponedID = 1
        )

        val mainPostOnWall = Wall.add(mainPost);


        // act
        val result = Wall.update(updateMainPost);

        // assert
        assertFalse(result)

    }

}