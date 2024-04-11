import java.util.LinkedList

/*
Rotate Array

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

fun main() {
    println(rotate1(intArrayOf(1,2,3,4,5,6,7),3).toList()) //best solution
    println(rotate2(intArrayOf(1,2,3,4,5,6,7),3).toList())
}

fun rotate1(nums: IntArray, k: Int) : IntArray {
    val size = nums.size
    val result = IntArray(size)
    //newIndex
    //0 + 3 % 7 = 3 number = 1
    //1 + 3 % 7 = 4 number = 2
    //2 + 3 % 7 = 5 number = 3
    //3 + 3 % 7 = 6 number = 4
    //4 + 3 % 7 = 0 number = 5
    //5 + 3 % 7 = 1 number = 6
    //6 + 3 % 7 = 2 number = 7
    for (i in nums.indices) {
        val newIndex = (i + k) % size
        result[newIndex] = nums[i]
    }
    // Copy elements from result array back to nums array
    return result.copyInto(nums)
}

//my solution 416ms, it is not a good solution
fun rotate2(nums: IntArray, k: Int) : IntArray {
    val newList = LinkedList<Int>()
    newList.addAll(nums.toList())
    for (times in 1..k) {
        newList.push(newList.last)
        newList.removeLast()
    }

    newList.forEachIndexed { index, i ->
        nums[index] = i
    }
    return nums
}