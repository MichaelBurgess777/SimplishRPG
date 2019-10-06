package Player
import Roles.RoleBase
import Roles.Warrior

object Player {

    //Player variables
    private var name: String = "Chosen"
    private var age: Int = 27
    private var roleInput: String = "warrior"
    private var roleClass: RoleBase = Warrior()
    private var location: String = "Grand Oak Tree"

    //Prompts the player to select a role and then goes through what they put in and assigns a role to the roleclass variable
    fun selectRole(){
        println("Select your role \n 1.Warrior")
        Player.roleInput = readLine().toString()

        when(roleInput){
            "warrior","Warrior","1" -> roleClass = Warrior()
            else -> selectRole()
        }
    }

    //Prompts the player to input a name
    fun setName(){
        println("What's your name?")
        name = readLine().toString()
        println("Are you sure you want $name as your name? Y/N")
        if (readLine().toString() == "N" || readLine().toString() == "n"){
            setName()
        }

    }

    //Returns the "name" variable
    fun getPlayerName(): String{
        return name
    }

    //Returns the "age" variable
    fun getPlayerAge(): Int{
        return age
    }

    //Returns the "roleClass" variable
    fun getPlayerRole(): RoleBase{
        return roleClass
    }


}