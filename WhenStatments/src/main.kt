fun main(args: Array<String>) {
    print("Enter a number from 1-10 to translate it into Spanish!: ")
    var num = readLine()!!.toInt()
    var numberString = "x"

    when (num){
        1 -> numberString = "Uno"
        2 -> numberString = "Dos"
        3 -> numberString = "Tres"
        4 -> numberString = "Quatro"
        5 -> numberString = "Cinco"
        6 -> numberString = "Seis"
        7 -> numberString = "Siete"
        8 -> numberString = "Ocho"
        9 -> numberString = "Nueve"
        10 -> numberString = "Diez"
        !in 1..10 -> numberString ="Out of Range"
        else -> numberString = "Unknown"
    }
if (num in 1..10) {
    println("In Spanish the number $num is $numberString")
}
else {
    println("Invalid number")
}

}