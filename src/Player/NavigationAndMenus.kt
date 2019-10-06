package Player

class NavigationAndMenus(val playerClass: Player = Player) {

    fun menu(){
        println("\n\n\n[inventory][map][quests][skills]")
        when(readLine()){
            "inventory", "i", "I", "Inventory" -> inventory()
            "map", "M", "m", "Map" -> map()
            "quests", "q", "Q", "Quests" -> quests()
            "skills", "s", "S", "Skills" -> skills()
        }
    }

    private fun inventory(){

    }

    private fun map(){

    }

    private fun quests(){

    }

    private fun skills(){

    }
}