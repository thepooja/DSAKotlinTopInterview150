package Array

//121. Best Time to Buy and Sell Stock

fun main() {

    var prices = intArrayOf(7,1,5,3,6,4)
    var profit = maxProfit(prices)
    println("Profit for stocks is - ₹ $profit")
}

fun maxProfit(prices:IntArray):Int{

    var profit = 0
    var buy = prices[0]

    for (price in prices){

        if(price < buy){
            buy = price
        }
        else if (profit < (price - buy)){
            profit = price - buy
        }
    }


    return profit

}