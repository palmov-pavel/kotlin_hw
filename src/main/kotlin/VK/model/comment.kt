package VK.model

data class comment(
    val count: Int = 0,
    val canPost: Boolean = false,
    val groupCanPost: Boolean  = false,
    val canClose: Boolean = false,
    val canOpen: Boolean  = false
)
