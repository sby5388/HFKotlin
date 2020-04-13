package ch06

/**
 * @author  by5388  on 2019/7/23.
 */
abstract class Animal : Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The ch05.ch06.Animal is roaming")
    }

    fun sleep() {
        println("The ch05.ch06.Animal is sleeping")
    }
}