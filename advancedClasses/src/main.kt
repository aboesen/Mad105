import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*


class Employee(var Name: String, var position: String, var salary: Boolean, var payRate: Double,var shift: Int)
{
    val dec = DecimalFormat("#,###.00")
    fun printAll() {
        val payRateFormat = dec.format(payRate)
        println("$Name\n$position Is salary: $salary \nshift: $shift\nRate of pay is: \$ $payRateFormat  per hour")
    }

    fun calc(hoursIn:Int, person: Employee) {
        var totalPay: Double = 0.00
        var totalPayText: String = ""
        var overtimePay: Double = 0.00
        totalPay = if(person.salary) {
            (person.payRate)*hoursIn
        }
        else{
            if (hoursIn > 40){
                (payRate*40)+((payRate*1.5)*(hoursIn-40))
            } else{
                payRate * hoursIn
            }
        }
        if(shift == 2)
        {
            totalPay = (totalPay * 1.05)
        }
        if(shift == 3)
        {
            totalPay = (totalPay * 1.1)
        }

        totalPayText = dec.format(totalPay)
        println("${person.Name} earned \$$totalPayText this week")
    }
}

enum class Position{
    Administration, Production, Sales, Maintenance, Technical, Secretarial
}

fun main(args: Array<String>) {


    val emp1 = Employee("Barney Rubble", Position.Maintenance.toString(), false, 21.00, 1)
    val emp2 = Employee( "Fred Flinstone", Position.Production.toString(), false, 22.00, 2)
    val emp3 = Employee( "George Slate", Position.Administration.toString(), true, 27.00, 3)

    emp1.printAll()
    emp1.calc(40, emp1)
    println("\n")
    emp2.printAll()
    emp2.calc(40, emp2)
    println("\n")
    emp3.printAll()
    emp3.calc(40, emp3)

}