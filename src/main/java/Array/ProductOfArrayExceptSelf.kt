package Array


fun main() {
    var solution = Solution()

    var output = solution.productExceptSelf(intArrayOf(1,2,3,4))

    println(output.contentToString())
}

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val answer = IntArray(n)

        // Step 1: Left products
        var leftProduct = 1
        for (i in 0 until n) {
            answer[i] = leftProduct
            leftProduct *= nums[i]
        }

        // Step 2: Right products
        var rightProduct = 1
        for (i in n - 1 downTo 0) {
            answer[i] *= rightProduct
            rightProduct *= nums[i]
        }

        return answer
    }
}