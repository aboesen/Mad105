import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

fun main(args: Array<String>) {
    var moons = arrayOf(0, 28, 27, 28, 26, 24, 23, 23, 22, 20, 20, 19, 18)
    var year: Int = Calendar.getInstance().get(Calendar.YEAR)
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    var today = LocalDate.now()
    val formattedToday = today.format(formatter)

    println("Today is $formattedToday")

    var fullmoonMonth = today.monthValue

    var fullmoonDay: Int = moons[fullmoonMonth]

    var holdMoonDate: LocalDate = LocalDate.of(year,fullmoonMonth,fullmoonDay)

    if (holdMoonDate.isBefore(today)){
        println("$holdMoonDate")
        holdMoonDate = holdMoonDate.plusMonths(1)
        fullmoonDay = moons[holdMoonDate.monthValue]
        holdMoonDate = LocalDate.of(year,fullmoonMonth +1,fullmoonDay)
    }

    var nextFullmoon = holdMoonDate.format(formatter)

    var daysToFullmoon = today.until(holdMoonDate, ChronoUnit.DAYS)

    if (daysToFullmoon.toInt() == 0){
        println("The full moon is tonight! Beware of Werewolves and don't sleep outside!")
        holdMoonDate = holdMoonDate.plusDays(3)
        nextFullmoon = holdMoonDate.format(formatter)
        println("The full moon will last until $nextFullmoon")
    } else {
        println("The next Full Moon is on: $nextFullmoon and there are $daysToFullmoon days until then!")
    }




}