import java.text.DecimalFormat //Needed to properly format the doubles into strings.

open class Customer constructor(Name: String, nPhone: String, address: String, squareFootage: Double) { //Creates the base class for the others to inherit

    var Name: String = ""
    var nPhone: String = ""
    var address: String = ""
    var squareFootage: Double = 0.00

    init {
        this.Name = Name
        this.nPhone = nPhone
        this.address = address
        this.squareFootage = squareFootage
    }
}


class Commercial constructor(Name: String, nPhone: String, address: String, squareFootage: Double, propName: String, multiProp: Boolean):
    Customer(Name, nPhone, address, squareFootage){ //Creates a class for the commercial clients, it also inherits the customer class
    var multiProp = false
    var propName: String = ""
    val dec = DecimalFormat("#,###.00")

    init {
        this.Name = Name
        this.nPhone =nPhone
        this.address = address
        this.squareFootage = squareFootage
        this.propName = propName
        this.multiProp = multiProp
    }
    fun weeklyCalc(client: Commercial){//This function calculates the weekly cost at $5 per 1000sqft with a 50$ penalty for yards bigger than 10,000sqft
        var totalCost: Double = 0.00

        totalCost = if(client.squareFootage > 10000){
            ((client.squareFootage / 1000) * 5) + 50
        }else{
            (client.squareFootage / 1000) * 5
        }

        if(client.multiProp) {//For clients with multiple properties they receive a 10% discount
            totalCost *= 0.9
        }
        var sqftText = dec.format(client.squareFootage)
        var totalCostText: String = dec.format(totalCost)

        println("-------Contact Info-------") //This section prints the client's information in an ordered manner with their pricing
        println("| Name: ${client.Name}\n" +
                "| Phone#: ${client.nPhone}\n" +
                "| Address: ${client.address}\n" +
                "| Square Footage: $sqftText\n" +
                "| Property Name: ${client.propName}\n" +
                "| Multi-Property: ${client.multiProp}\n")
        println("-------Pricing Info-------")
        println("| Total Cost: $totalCostText\n" +
                "--------------------------")
    }
}


class Residential constructor(Name: String, nPhone: String, address: String, squareFootage: Double, seniorProp: Boolean):
    Customer(Name, nPhone, address, squareFootage){//Creates a class for the Residential clients, it also inherits the customer class
    var seniorProp = false
    val dec = DecimalFormat("#,###.00")

    init {
        this.Name = Name
        this.nPhone =nPhone
        this.address = address
        this.squareFootage = squareFootage
        this.seniorProp = seniorProp
    }
    fun weeklyCalc(client: Residential){
        var totalCost: Double = 0.00

        totalCost = (client.squareFootage / 1000) * 6

        if(client.seniorProp) {//For clients above the age of 65 (Senior), they receive a 15% discount
            totalCost *= 0.85
        }
        var sqftText = dec.format(client.squareFootage)
        var totalCostText: String = dec.format(totalCost)

        println("-------Contact Info-------")//This section prints the client's information in an ordered manner with their pricing
        println("| Name: ${client.Name}\n" +
                "| Phone#: ${client.nPhone}\n" +
                "| Address: ${client.address}\n" +
                "| Square Footage: $sqftText\n" +
                "| Senior Property: ${client.seniorProp}\n")
        println("-------Pricing Info-------")
        println("| Total Cost: $totalCostText\n" +
                "--------------------------")
    }
}

fun main(){
    var quit: Boolean = true
    var response: Int = 0
    //The line below creates a Commercial class object called person1
    var person1:Commercial = Commercial("Wally West", "555-867-5309", "555 Waldo Drive", 12000.00, "Wally World", true)
    //The line below creates a Residential class object called person2
    var person2:Residential = Residential("Tim Thompson", "555-867-5308", "555 Waldo Ave", 3000.00, true)

    //Creates a repeating menu for the user to select from.
    while (quit){
        println("----Lawns R Us----\n" +
                "1. Commercial Customer\n" +
                "2. Residential Customer\n" +
                "3. Quit")
        try {//Confirms that the response is a valid option
            response = readLine()!!.toInt()
        }catch (e: Exception){
            println("Please select on of the options using the numbers 1, 2 or 3.")
        }
        
        when(response)//Checks which response is selected and picks the corresponding item.
        {
            1 -> person1.weeklyCalc(person1)
            2 -> person2.weeklyCalc(person2)
            3 -> quit = false
            else -> println("Please select on of the options using the numbers 1, 2 or 3.")
        }
    }
}

