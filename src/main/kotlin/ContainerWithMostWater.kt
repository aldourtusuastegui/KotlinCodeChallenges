import kotlin.jvm.internal.Intrinsics.Kotlin
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

/*
* Container With Most Water
*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
*
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
* In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1
*
*
*
* */

fun main() {
    println(maxArea(intArrayOf(6,5,4,3,2,1)))
    println(maxArea2(intArrayOf(1,2,1)))
}

fun maxArea(heights: IntArray): Int {
    var maxArea = 0
    var p1 = 0
    var p2 = heights.size-1
    while (p1 < p2) {
        val height = min(heights[p1],heights[p2])
        val width = p2 - p1
        val area = width * height
        maxArea = max(maxArea,area)

        if (heights[p1] <= heights[p2]) {
            p1++
        } else {
            p2--
        }
    }

    return maxArea
}

fun maxArea2(heights: IntArray): Int {
    //min x distance
    var maxArea = 0
    heights.forEachIndexed { p1, number ->
        for (p2 in p1.plus(1)..<heights.size) {
             val height = min(heights[p1],heights[p2])
             val width = p2-p1
             val currentArea = height * width
             if (currentArea>maxArea) {
                 maxArea =currentArea
             }
            //maxArea = max(maxArea, currentArea)
            //maxArea = maxArea.coerceAtLeast(height[min] * distance)
        }
    }
    return maxArea
}