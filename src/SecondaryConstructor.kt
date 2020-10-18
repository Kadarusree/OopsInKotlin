fun main(){
      var school = School("Sharada High School")
    school.givesEducation()

    var human = Human(10,"Sreekanth")
}

class School(var name : String){
    var schoolName : String = ""

    init {
        schoolName = name;
        println("This is Init Block")
    }
    fun givesEducation(){
        println("School Name is $schoolName")
    }
}


class Human constructor(var ageof : Int){
    var age : Int = ageof;
    var humanname : String = ""
    init {
        println("Executing a primary constructor")
    }
    constructor(  age : Int,  name : String ) : this(age){
      this.age = age;
        this.humanname = name
        println( "${this.age}==${this.humanname}")
    }
}