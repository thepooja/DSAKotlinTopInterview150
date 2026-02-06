package Array

fun main() {
    val checkJump = canJump(intArrayOf(2,3,1,1,4))
    println("I can Jump : $checkJump ")
}

fun canJump(nums: IntArray): Boolean {

    var maxReach = 0

    for (i in nums.indices) {

        if (i > maxReach) {
            return false
        }

        maxReach = maxOf(maxReach, i + nums[i])
    }
    return true

}