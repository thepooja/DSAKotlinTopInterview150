package Array

fun main() {
    var prices = intArrayOf(7,1,5,3,6,4)
    var totalP = maxProfit(prices)
    println("Total Profit is : $totalP")
}

private fun maxProfit(prices:IntArray):Int{
    var totalProfit = 0
    for (i in 1 until prices.size){
        if(prices[i] > prices[i-1]){
            totalProfit += prices[i] - prices[i-1]
        }
    }

    return totalProfit

}