import java.io.Serializable

fun main(args: Array<String>) {
    val array = arrayOf("John", "Mary", "Bobby")
    //mixed array
    val mixedArray = arrayOf(1,2,3,"John",'a')

    array[0] = "Alex"
    println("First Element : ${array[0]}")
    println("The size of the array : ${array.size}")

    for(number in mixedArray) {
        //is using for checking type return boolean
        if(number is Int) {
            println(number)
        }
    }
}