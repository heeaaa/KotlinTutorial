fun main(args: Array<String>) {
    println("Hello World")
    println("This is the main function")

    val name = "Hanna"
    println(name)

    val monthlySalary = 10
    val annualSalary: Int = monthlySalary * 12
    println("Monthly salary: $monthlySalary")
    println("Annual salary : $annualSalary")

    println()

    val weeks = 234
    val years: Double = weeks / 52.0
    println("$weeks weeks is $years years ")

    println()

    conditions()

}


fun conditions() {
    val lives = 3

    val isGameOver = (lives<1)
    println("Game Over? $isGameOver")

    if (isGameOver) {
        println("Game over!")
    } else {
        println("You're still alive!")
    }

    println("How old are you? ")
    val age = readLine()!!.toInt()
    println("age is $age")

    val message = when {
        age < 17 -> "You're too young to vote!"
        age > 60 -> "You're too old to vote!"
        else -> "Congratulations! You can vote."
    }

    println(message)

}
