fun main() {
    var userInput = 0

    do {
        println("1: Play")
        println("2: Pause")
        println("3: Save")
        println("4: Load")
        println("5: Options")
        println("6: Exit")

        userInput = readLine()!!.toInt()
        println("You selected option $userInput")
    }while(userInput != 6)
}