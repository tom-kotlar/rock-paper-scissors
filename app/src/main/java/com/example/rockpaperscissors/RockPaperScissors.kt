package com.example.rockpaperscissors

fun main() {
    var computerChoices = ""
    var playerChoices = ""
    println("Rock Paper Scissors Game. Please enter your choice")
    playerChoices = readln()

    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            computerChoices = "Rock"
        }
        2 -> {
            computerChoices = "Paper"
        }
        3 -> {
            computerChoices = "Scissors"
        }
    }

    println(computerChoices)

    var winner = when {
        playerChoices == computerChoices -> "Tie"
        playerChoices == "Rock" && computerChoices == "Scissors" -> "Player"
        playerChoices == "Paper" && computerChoices == "Rock" -> "Player"
        playerChoices == "Scissors" && computerChoices == "Paper" -> "Player"
        else -> "Computer"
    }


    if (winner == "Tie") {
        println("It's a Tie")
    } else if (winner == "Player") {
        println("Player won")
    } else {
        println("Computer won")
    }

}