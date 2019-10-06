package Enemies

import Items.Weapons.WeaponsBase

class Goblin(level: Int): EnemyBase() {

    override var maxHP: Int = (5 + 3 * level)
    override val enemyName: String = "goblin"
    override var currentHP: Int = maxHP
    override var weapons: Array<WeaponsBase> = arrayOf(WeaponsBase("rusty dagger", 1, false, "none"))

    override fun attackOutput(): String{

        return when((1..3).random()){
            1 -> "attack"
            2 -> "feint"
            3 -> "counter"
            else -> "Error 9801"
        }
    }

}