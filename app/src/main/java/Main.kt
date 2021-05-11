fun main(args: Array<String>) {

//    helloWorld()
//
//    println()
//
//    conditions()

    val tim = Player("Tim")
    tim.show()

    val luis = Player("Luis", 5)
    luis.show()

    val katie = Player("Katie", 4,8)
    katie.show()

    val art = Player("Art", 2, 5 , 1000)
    art.show()

}

private fun helloWorld() {
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
}


private fun conditions() {
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
