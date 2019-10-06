import Player.Player
import Player.NavigationAndMenus
import Enemies.Goblin

fun main(arg: Array<String>){

    //Creates variables
    //TODO Make combat more procedural
    val combatTest: Combat = Combat()
    val log: Dialogue = Dialogue(Player)
    val goblin: Goblin = Goblin(2)
    val navAndMenu: NavigationAndMenus = NavigationAndMenus()


    log.playDialogue()
    Player.selectRole()
    println(Player.getPlayerRole().roleName)
    Player.setName()

    //TODO give player full control of actions by using the NavigationAndMenus Class.
}