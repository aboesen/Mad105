
fun main(){
    var total = 0.00
    //Looping menu to record item prices
    while(true){
        println("Enter the cost of your item ")
        println("Enter 'end' to calculate")
        var value = readLine()!!.toString()
        if (value != "end") {
            total += value!!.toDouble()
        }
        else{
            break
        }
    }
    //Calculations for tax and totals regarding tax
    var tax = total * 0.025
    var totalTax = total + tax
    var tipTotal = totalTax + (total *0.175)
    //Display of totals
    println("Your total is: $ %.2f".format(total))
    println("The tax comes out to: $ %.2f".format(tax))
    println("the total with tax included is: $ %.2f".format(totalTax))
    //tip prompt
    println("Would you like to add a 17.5% tip? y/n")
    var response = readLine()!!.toString()
    if (response == "y"){
        println("Your total is: $ %.2f".format(tipTotal))
    }
    if (response == "n"){
        println("Your total is: $ %.2f".format(totalTax))
    }
}
