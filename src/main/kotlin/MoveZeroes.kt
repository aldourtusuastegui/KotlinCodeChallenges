/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
*/

fun main() {
    println(moveZeroes(intArrayOf(0,1,0,3,12)).toList())
    println("----------------------")
    println(moveZeroes(intArrayOf(0)).toList())
}

//complexity O(n)
fun moveZeroes(nums: IntArray): IntArray {
    var index = 0
    nums.forEachIndexed { position, number ->
        if (number!=0) {
            nums[position] = 0
            nums[index] = number
            index++
        }
    }
    return nums
}