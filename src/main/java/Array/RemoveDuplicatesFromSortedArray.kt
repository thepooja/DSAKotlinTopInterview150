package Array

//26. Remove Duplicates from Sorted Array

fun main() {

    var nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)

    var k = 1
    for (i in 1 until nums.size){

        if(nums[i] != nums[i-1]){
            nums[k] =nums[i]
            k++
        }
    }

    println(nums.contentToString())
}