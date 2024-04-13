/*
* Two Sum
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
*
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*
*
* */

fun main() {
    println(twoSum(intArrayOf(1,1,1,1,1,4,1,1,1,1,1,7,1,1,1,1,1),11)?.toList())
    println(twoSumLongComplexity(intArrayOf(1,1,1,1,1,4,1,1,1,1,1,7,1,1,1,1,1),11)?.toList())
}

fun twoSumLongComplexity(nums: IntArray, target: Int) : IntArray? {
   for (p1 in nums.indices) {
       val goal = target - nums[p1]
       for (p2 in p1.plus(1)..<nums.size) {
           if (nums[p2]==goal) {
               return intArrayOf(p1,p2)
           }
       }
   }
   return null
}

//complexity O(n)
fun twoSum(nums: IntArray, target: Int) : IntArray? {
    val hashMap = mutableMapOf<Int,Int>()
    nums.forEachIndexed { index, number ->
        val numberToFind = target - number
        if (hashMap.containsKey(numberToFind)) {
            return intArrayOf(hashMap[numberToFind]!!,index)
        }
        hashMap[number] = index
    }
    return null
}
