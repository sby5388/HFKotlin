package ch05

/**
 * @author  by5388  on 2019/7/23.
 */
open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The ch05.ch06.Animal is making a noise")
    }

    open fun eat() {
        println("The ch05.ch06.Animal is eating")
    }

    open fun roam() {
        println("The ch05.ch06.Animal is roaming")
    }

    fun sleep() {
        println("The ch05.ch06.Animal is sleeping")
    }
}