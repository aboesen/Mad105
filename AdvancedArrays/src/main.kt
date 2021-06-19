fun main(){
    var storeList= arrayOf<String>("Chocolate Ice Cream","Vanilla Ice Cream","Strawberry Ice Cream","Waffle Cones","Sprinkles", "Exit")
    var quantityList = arrayOf<Int>(2,4,3,2,1,0)
    var input = 0
while (input != 6) {
    var count = 1
    for (sitem in storeList) {
        println("$count- $sitem")
        count++
    }
    input = readLine()!!.toInt()
    if(input==6) {break}
    
    println("The quantity is ${quantityList[input-1]}")
    println("1. Add? \n2. Subtract?\n")
    var input2 = readLine()!!.toInt()
    if (input2 == 1)
    {
        quantityList[input-1] += 1
    }
    else if (input2 == 2){
        if ((quantityList[input-1] - 1) >= 0)
        {
            quantityList[input-1] -= 1
        }
        else{
            println("Subtracting this value would decrease it below zero")
        }
        }
    else{
        println("Invalid number.")

        }
    }
}