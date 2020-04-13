package ch05

/**
 * @author  by5388  on 2019/7/23.
 */
class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The ch05.ch06.Hippo is eating $food")
    }
}