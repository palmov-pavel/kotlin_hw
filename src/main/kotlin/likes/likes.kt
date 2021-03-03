package likes

fun main() {

    val likes = 21112
    val result =
    when {
        (likes == 1) -> "человеку"
        (likes < 10) -> "людям"
        ((likes-1)%10 == 0) -> "человеку"
        else -> "людям"
    }

    println("Понравилось $likes $result")
}