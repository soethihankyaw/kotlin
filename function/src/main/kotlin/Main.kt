
fun main(args: Array<String>) {
    sayHello("Soe Thi", 30)

    val max = getMax(5.6, 9.7);
    println(max)

    sendMessage()

    println(sum(1,2,3,4,5))
    getNumber(1,2,3,4,5)
}

fun sayHello(name: String, age: Int) {
//    println("Hello " + name )
    //$ can pass like parameter string interpolation
    println("Hello,my name is $name and $age years old!")
}

//method overloading
fun getMax(a: Int, b: Int) = if(a > b) a else b

fun getMax(a: Double, b: Double) = if(a > b) a else b

//default value in function
fun sendMessage(name: String = "message", message: String = ""){
    println("$name say $message")
}

//vararg in function parameter
fun sum(vararg numbers: Int) :Int {
    var result = 0
    for(number in numbers) {
        result += number
    }

    return result
}

fun getNumber(vararg numbers: Int) {
    numbers.forEach { println(it) }
}