fun main(args: Array<String>) {
    var value=0.0

    while (true) {
        print("Enter a number between 92.0 and 104.0: ")

        value = readLine()!!.toDouble()
        if (99.5 < value && value < 104)
            println("High")
        else if (97.5 < value && value < 99.5)
            println("Normal")
        else if (92 < value && value < 97.5)
            println("Low")
        else
            println("Please enter a number between 92.0 and 104.0")
    }
}