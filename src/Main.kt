/**
 * A little guessing game in Kotlin
 */


fun main() {
    println("---------------------")
    println(" Guessing Game 2000 ")
    println("-----------------------")
    println()

    val numToGuess = (1..100).random()

    println("I'm thinking of a number from 1 - 100")
    println("Can you guess it?")

    val scoreText = "1000"
    var score = scoreText.toIntOrNull()
    println("Score: $score")

    // MAIN LOOP
    while (true) {
        // Ask the user for a  guess
        val guess = readln().toIntOrNull()

        if (guess == null) {
            println("Enter a number!")
            continue
        }
        if (guess == numToGuess) {
            println("Yeah you got it!")
           val score = 1
            println("Score: $score")
            break
        }
        else if (guess > numToGuess)
            println("You have guessed too high")
        else
            println("You have guessed too low")
        
        // Check if it's correct

        // Break out of the loop if correct

        // Otherwise give high/lower feedback

        }
    }