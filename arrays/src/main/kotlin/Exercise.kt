fun main(args: Array<String>) {
    var array = arrayOf(1,2,3,5,6,33,25,343,45)

   var max =  findMax(array)
   var min = findMin(array)

    println("Max Value : ${max}")
    println("Min Value : $min")
}

fun findMax(numbers: Array<Int>) : Int {
    var max = numbers[0]

    for(number in numbers) {
        if(number > max) {
            max = number
        }
    }

    return max
}

fun findMin(numbers: Array<Int>) : Int {
    var min = numbers[0]

    for(number in numbers) {
        if(number < min) {
            min = number
        }
    }
    return min
}