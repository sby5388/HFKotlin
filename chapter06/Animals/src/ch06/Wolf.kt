package ch06

/**
 * @author  by5388  on 2019/7/23.
 */
class Wolf: Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooowl!")
    }

    override fun eat() {
        println("The ch05.ch06.ch08.Wolf is eating $food")
    }
}