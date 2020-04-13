/**
 * @author  by5388  on 2019/7/23.
 */
const val shitou = "shitou"
const val jiandao = "jiandao"
const val bu = "bu"

fun main(args: Array<String>) {
    val itemList = listOf(shitou, jiandao, bu)
    val gameItem = getGameItem(itemList)
    val userItem = getUserItem(itemList)
    printGameResult(gameItem, userItem)

}


fun getGameItem(list: List<String>): String {
    return list[(Math.random() * list.size).toInt()]
}

fun getUserItem(list: List<String>): String {
    print("Please enter one of the following:")
    for (item in list) {
        print(" $item")
    }
    println(".")
    var userChoice = ""
    var isValidChoice = false
    while (!isValidChoice) {
        val input = readLine()
        if (input != null && input in list) {
            isValidChoice = true
            userChoice = input
        }
        if (!isValidChoice) {
            println("You must enter a valid choice.")
        }
    }
    return userChoice
}

fun printGameResult(gameItem: String, userItem: String) {
    val result: String
    if (gameItem == userItem) {
        result = "Tie!"
    } else if ((userItem == shitou && gameItem == jiandao)
            || (userItem == jiandao && gameItem == bu)
            || (userItem == bu && gameItem == shitou)) {
        result = "You win!"
    } else {
        result = "You lose!"
    }

    println("You chose $userItem. I chose $gameItem. $result")

}