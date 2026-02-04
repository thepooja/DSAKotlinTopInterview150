package Array

/* 189. Rotate Array */
fun main() {

    var nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    var k = 3

    val n = nums.size
    val steps = k % n

    reverse(nums, 0, n - 1)
    reverse(nums, 0, steps - 1)
    reverse(nums, steps, n - 1)

    println(nums.contentToString())


}

fun reverse(arr: IntArray, start: Int, end: Int) {

    var l = start
    var r = end

    while (l < r) {

        val temp = arr[l]
        arr[l] = arr[r]
        arr[r] = temp
        l++
        r--
    }

}

