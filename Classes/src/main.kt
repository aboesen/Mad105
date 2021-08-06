class Contacts(var Name: String?, var employeeNumber: String?, var shift: Int?)
{

    fun printAll() {
        println(Name + "\n" + employeeNumber + "\n" + shift)
    }
}

fun main(args: Array<String>) {


    val person1 = Contacts("Barney Rubble", "815-555-1234", 2)
    val person2 = Contacts( "Fred Flinstone", "815-555-3334", 1)
    val person3 = Contacts( "George Slate", "815-555-6479", 3)

    person1.printAll()
    println("\n")
    person2.printAll()
    println("\n")
    person3.printAll()

}