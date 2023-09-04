//val cannot be resigned also immutable variable
val firstName: String = "Soe Thi"
//var can be changed also mutable variable
var lastName: String = "Han Kyaw"
//? means nullable value
var greet: String? = null

fun main() {
//    greet = "Hello"
    // if controlflow
    if(greet != null) {
        println(greet + ",My name is " + firstName + " " + lastName)
    } else {
        println("Hi " + firstName)
    }
    //when controlflow
    when(greet) {
        null -> println("Hi " + firstName)
        else -> println(greet + ",My name is " + firstName + " " + lastName)
    }

    //if controlflow like when like functional
    if(greet != null) println(greet + ",My name is " + firstName + " " + lastName) else "Hi "+firstName

//    println(ifControlGreet)
}