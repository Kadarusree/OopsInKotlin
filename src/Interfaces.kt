fun main(){
    var c = C()
    c.display();
    c.methodA()
    c.methodB()
    c.show()
}


interface A{
    fun methodA()
    fun methodB()

    fun methodC(){

    }
}

interface B{
    fun show()
    fun display()
    fun methodC(){

    }
}

class C : A , B{
    override fun methodA() {
        println("Method A")
    }

    override fun methodB() {
        println("Method A")
    }

    override fun show() {
        println("Show")
    }

    override fun display() {
        println("display")
    }

    override fun methodC() {
        super<B>.methodC()
        super<A>.methodC()
    }
}