package VK.model.comments

import VK.model.attachments.Attachment

data class Comment(
    val id:Int,
    val fromId:Int,
    val date:Int,
    val text:String,
    val donut:Donut?,
    val replayToUser:Int,
    val replayToComment:Int,
    val attachments: Array<Attachment?>,
    val parentStack: Array<Int?>,
    val thread:Thread?
)
