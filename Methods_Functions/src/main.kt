fun main(){
    println(":::::::Menu:::::::")
    println("1. Triangle")
    println("2. Squares")
    println("3. Rectangle")
    println("4. Circle")
    var input = readLine()!!.toInt()

    when(input){
        1 -> op1()
        2 -> op2()
        3 -> op3()
        4 -> op4()
        else -> println("That is not a valid number.")
    }
}

fun op1(){
    println("You have selected Triangle")
    println("What is the height?:")
    var height = readLine()!!.toDouble()
    println("What is the width?:")
    var width = readLine()!!.toDouble()

    var area = (0.5) * height * width

    println("The area of your Triangle is : $area")
}

fun op2(){
    println("You have selected Square")
    println("What is the Side Length?:")
    var side = readLine()!!.toDouble()

    var area = side * side

    println("The area of your Square is : $area")
}

fun op3(){
    println("You have selected Rectangle")
    println("What is the height?:")
    var height = readLine()!!.toDouble()
    println("What is the width?:")
    var width = readLine()!!.toDouble()

    var area =  height * width

    println("The area of your Rectangle is : $area")
}

fun op4(){
    println("You have selected Circle")
    println("What is the radius?:")
    var radius = readLine()!!.toDouble()

    var area = 2 * 3.141526 * (radius * radius)

    println("The area of your Circle is : $area")
}
