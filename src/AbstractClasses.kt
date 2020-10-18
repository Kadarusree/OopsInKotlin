fun main() {
    var dev = AndroidDeveloper()
    dev.writePrograms();
    dev.developsSoftware()

}

abstract class Developer
{
   abstract fun developsSoftware()

    fun writePrograms(){
        println("This is a non abstract class")
    }
}

class AndroidDeveloper : Developer(){
    override fun developsSoftware() {
        println("Software developers develop softwares")
    }

}