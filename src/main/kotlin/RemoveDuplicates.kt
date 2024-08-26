fun main() {
    println(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var uniqueIndex = 0

    for (i in 1..<nums.size) {
        val number = nums[i]
        if (number!=nums[uniqueIndex]) {
            uniqueIndex++
            nums[uniqueIndex] = number
        }
    }
    return uniqueIndex +1
}