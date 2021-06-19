fun main(){
    println(":::::::Menu:::::::")
    println("1. Business")
    println("2. Residential")
    var input = readLine()!!.toInt()

    println("What is a number we can contact you at?:")
    var inputNumber = readLine()!!
    println("What is a name that we can add to our Contact list?:")
    var inputName = readLine()!!
    when(input){
        1 -> {
            println("What is the name of your business?:")
            var inputBusiness = readLine()!!
            infoDisplay(inputNumber, inputBusiness ,inputName)
        }
        2 -> infoDisplay(inputNumber, inputName)

    }

}

fun infoDisplay(number: String, name:String){
    println("The following is on file for you.")
    println("Customer Type: Residential")
    println("Contact Name: $name")
    println("Contact Number: $number")
}
fun infoDisplay(number: String, businessName: String ,name:String){
    println("The following is on file for you.")
    println("Customer Type: Business")
    println("Business Name: $businessName")
    println("Contact Name: $name")
    println("Contact Number: $number")
}