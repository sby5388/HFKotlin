/**
 * @author  by5388  on 2020/4/13.
 */
fun main() {
    val integerArray = arrayOf(1, 2, 3)
    println(integerArray.javaClass.name)
    for (i in integerArray) {
        println("i = $i")
    }

    val stringArray = arrayOf("1", "2", "3")
    for (s in stringArray) {
        println("s = $s + ${s.javaClass.name}")
    }
}