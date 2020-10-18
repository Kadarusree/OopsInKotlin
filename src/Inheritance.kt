fun main(){
    //like in Java kotlin doesnt supprot multiple inheritance
    var company = Company(2007)
    company.works()

    var myComapny : Company = MyCompany(2007)
    myComapny.works()
}

//lets take a class
//if you want your class extended by others you should make your class open with open keyword
//by default all your classes and methods are final
open class Company(est : Int){
    init {
        println("Super class constructor and established in $est")
    }
   open fun works(){
        println("Company Works ")
    }
}
//by default all classes are final in kotlin
class MyCompany(est : Int) : Company(est){
    init {
        println("My Company Constructor")
    }
   override fun works(){
        println("Child Company Works")
    }
}

//When we create an object of a class in java , it executes constructor of a super class as well