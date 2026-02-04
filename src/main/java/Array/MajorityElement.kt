package Array
// 169. Majority Element
fun main() {

    var nums = intArrayOf(2,2,1,1,1,2,2)

    var count = 0
    var candidate = 0

    for (num in nums){

        if (count ==0 ){
            candidate = num
        }
        if(num == candidate){
            count++
        }

        else{
            count --
        }
    }

    print("MajorityElement is $candidate")

}