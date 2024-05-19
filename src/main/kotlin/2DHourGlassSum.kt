fun main() {
    println(hourglassSum(arrayOf(
        arrayOf(1,1,1,0,0,0),
        arrayOf(0,1,0,0,0,0),
        arrayOf(1,1,1,0,0,0),
        arrayOf(0,0,0,0,0,0),
        arrayOf(0,0,0,0,0,0),
        arrayOf(0,0,0,0,0,0)
    )))
}

fun hourglassSum(arr: Array<Array<Int>>): Int {
    var maxHourGlass = Int.MIN_VALUE
    for (i in 1 until arr.size -1) {
        for (j in 1 until arr[i].size -1) {
            val sum = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] +
                    arr[i][j] +
                    arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]

            maxHourGlass = maxOf(maxHourGlass,sum)
        }
    }
    return maxHourGlass
}
/**
 *  arrayOf(1,1,1,0,0,0),
 *  arrayOf(0,1,0,0,0,0),
 *  arrayOf(1,1,1,0,0,0),
 *  arrayOf(0,0,0,0,0,0),
 *  arrayOf(0,0,0,0,0,0),
 *  arrayOf(0,0,0,0,0,0)
 * */