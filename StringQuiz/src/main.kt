fun main(){
    var correctAnswers = 0
    var correct: Boolean
    val questionAnswers = arrayOf("kotlin","blue", "bear", "ketchup", "christmas")
    println("The language this program is written in is called ______.")
    var response = readLine()!!.toString()
    correct = response.equals(questionAnswers[0],true)
    correctAnswers = rightWrong(correct, correctAnswers)

    println("What color is the sky during the day?")
    response = readLine()!!.toString()
    correct = response.equals(questionAnswers[1],true)
    correctAnswers = rightWrong(correct, correctAnswers)

    println("What animal is the mascot of the Chicago football team?")
    response = readLine()!!.toString()
    correct = response.equals(questionAnswers[2],true)
    correctAnswers = rightWrong(correct, correctAnswers)

    println("What condiment is frown upon on a hotdog in Chicago?")
    response = readLine()!!.toString()
    correct = response.equals(questionAnswers[3],true)
    correctAnswers = rightWrong(correct, correctAnswers)

    println("What holiday is on December 25th?")
    response = readLine()!!.toString()
    correct = response.equals(questionAnswers[4],true)
    correctAnswers = rightWrong(correct, correctAnswers)

    println("The number of answers you have correctly answered is $correctAnswers")
}
fun rightWrong(answer:Boolean, totalRight:Int): Int {
    var right:Int = totalRight
    if(answer){
        println("That answer is correct!")
        right += 1
    }
    else
    {
        println("That answer is incorrect")
    }
    return right
}