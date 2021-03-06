package network_activity


fun MinutesToText(activityTime: Int):String{
    val minutes = (activityTime/60).toInt()
    when {
        ((minutes-1)%10 == 0 && !(minutes == 11))  -> return "$minutes минуту назад"
        ((minutes-2)%10 == 0 && !(minutes == 12))  -> return "$minutes минуты назад"
        ((minutes-3)%10 == 0 && !(minutes == 13))  -> return "$minutes минуты назад"
        ((minutes-4)%10 == 0 && !(minutes == 14))  -> return "$minutes минуты назад"
        else -> return "$minutes минут назад"
    }
}

fun HoursToText(activityTime: Int):String{
    val hours = (activityTime/60/60).toInt()
    when {
        ((hours == 1) || (hours == 21))  -> return "$hours час назад"
        ((hours == 2) || (hours == 22))  -> return "$hours часа назад"
        ((hours == 3) || (hours == 23))  -> return "$hours часа назад"
        ((hours == 4) || (hours == 24))  -> return "$hours часа назад"
        else -> return "$hours часов назад"
    }
}


fun agoToText(activityTime: Int):String{
    when {
        (activityTime < 60) -> return "только что"
        (activityTime < 60*60) -> return MinutesToText(activityTime)
        (activityTime < 24*60*60) -> return HoursToText(activityTime)
        (activityTime < 48*60*60) -> return "сегодня"
        (activityTime < 72*60*60) -> return "вчера"
        else -> return "давно"
    }
}

fun main() {
    var x = 1
    while (x < 60) {
        println("был(а) " + agoToText(x))
        x ++
    }

    while (x < 3600) {
        println("был(а) " + agoToText(x))
        x += 60
    }

    while (x < 3600*24) {
        println("был(а) " + agoToText(x))
        x += 60*60
    }

    println("был(а) " + agoToText(activityTime = x+1))
    println("был(а) " + agoToText(activityTime = x*2+1))
    println("был(а) " + agoToText(activityTime = x*5))
}