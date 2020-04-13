package ch12

/**
 * 杂货店
 */
data class Grocery(
        val name: String, val category: String,
        val unit: String, val unitPrice: Double,
        val quantity: Int
)

fun main(args: Array<String>) {
    val groceries = listOf(
            Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
            Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
            Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
            Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
            Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

//    todo 1分组=>hashMap
    groceries.groupBy { it.category }
            .forEach {
                println(it.key)
                it.value.forEach { println("    ${it.name}") }
            }

    val ints = listOf(1, 2, 3)
    //todo 累加，求和，初始值为0
    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    println("sumOfInts: $sumOfInts")

//    todo 初始值， 与2相乘后累加
    val productOfInts = ints.fold(2) { runningProduct, item -> runningProduct * item }
    println("productOfInts: $productOfInts")

    //todo 与以上累加相似，这不过这次是字符串
    val names = groceries.fold("") { string, item -> string + " ${item.name}" }
    println("names: $names")

//    todo 总价减去*** = 剩余的？
    val changeFrom50 = groceries.fold(50.0) { change, item
        -> change - item.unitPrice * item.quantity }
    println("changeFrom50: $changeFrom50")
}