package VK.service

import VK.model.attachments.*
import VK.model.Like
import VK.model.Post
import VK.model.Repost

fun main() {

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

    println(Wall.add(mainPost))

    val mainPost2 = Post(
        id = 333,
        ownerID = 888,
        formID = 3,
        createdBy = 88,
        date = 8,
        text = "мой второй пост VK",
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

    println(Wall.add(mainPost))

    val mainPost3 = Post(
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
    if (Wall.update(mainPost3)) {
        println(Wall.getPost(1))
    } else {
        println("не нашли")
    }


    val link1: LinkAttachment = LinkAttachment(AttachementType.link,"http:\\abc.ru", "ABC", "abc", "xxx", null, null, null, null, null)
    val photo1: PhotoAttachment = PhotoAttachment(AttachementType.photo,1, 33, 111, 222, "", 1, 1024,1024)
    val audio1: AudioAttachment = AudioAttachment(AttachementType.audio,2,1,"Sting",  "Desert Rose", 120,"http:\\abc.ru", 1, 1, 1, 1, true, true)
    val doc1: DocAttachment =  DocAttachment(AttachementType.doc,3, 1,"note.docx",11,"", "http:\\abc.ru", 1, 1, null)

    val video1: VideoAttachment = VideoAttachment(
        AttachementType.video,4, 1, "Буратино", "", 2400, "", "", "", "", "", "", "", "",
        "", "", 222, 1, 1, 1, "", true, true, false, "", false, false, false, true
    )


    val mainPost4 = Post(
        id = 3,
        ownerID = 1,
        formID = 3,
        createdBy = 4,
        date = 6,
        text = "VK",
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
        attachments = arrayOf(link1, photo1, audio1)
    )

    println(Wall.add(mainPost4))
    Wall.addAttachment(mainPost4, doc1)

    if (Wall.addAttachment(mainPost4, video1)) {
        println(Wall.getPost(3))
    } else {
        println("не нашли")
    }
}