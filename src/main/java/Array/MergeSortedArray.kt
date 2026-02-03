package Array

// LeetCode 88 - Merge Sorted Array
fun main() {

    var nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val m = 3
    val nums2 = intArrayOf(2, 5, 6)
    val n = 3

    var i = m - 1
    var j = n - 1
    var k = m + n - 1

    while (j >= 0) {

        if (i >= 0 && nums1[i] > nums2[j]) {
            nums1[k] = nums1[i]
            i--
        } else {
            nums1[k] = nums2[j]
            j--
        }
        k--
    }


}