package VK.service

import VK.model.comment
import VK.model.like
import VK.model.post
import VK.model.repost

fun main() {

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

    println(Wall.add(mainPost))

    val mainPost2 = post(
        id = 333,
        ownerID = 888,
        formID = 3,
        createdBy = 88,
        date = 8,
        text = "мой второй пост VK",
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

    println(Wall.add(mainPost))

    val mainPost3 = post(
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
    if (Wall.update(mainPost3)) {
        println(Wall.getPost(1))
    } else {
        println("не нашли")
    }



}