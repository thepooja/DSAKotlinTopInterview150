package Array

fun main() {
    var arr = intArrayOf(0,0,1,1,1,1,2,3,3)

    var k = 2

    for (i in 2 until arr.size) {

        if (arr[i] != arr[i - 2]) {
            arr[k] = arr[i]
            k++
        }
    }

    println(arr.contentToString())
}