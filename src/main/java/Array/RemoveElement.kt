package Array

// LeetCode - 27. Remove Element
fun main() {
    var nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
    val value = 2
    var k = 0
    for (i in nums.indices) {
        if (nums[i] != value) {
            nums[k] = nums[i]
            k++
        }
    }

}