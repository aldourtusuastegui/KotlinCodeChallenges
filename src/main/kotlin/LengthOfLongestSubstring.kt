/*Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3

Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

fun main() {
    println(lengthOfLongestSubstring(""))
}

fun lengthOfLongestSubstring(s: String): Int {
    var p1 = 0
    var longest = 0
    var currentStringSize = 0
    var startFrom = 0
    val set = mutableSetOf<Char>()
    while (p1 <= s.length -1) {
        val item = s[p1]
        if (set.contains(item)) {
            p1 = startFrom++
            currentStringSize = 0
            set.clear()
        } else {
            set.add(item)
            currentStringSize++
        }
        if (currentStringSize>longest) {
            longest = currentStringSize
        }
        p1++
    }
    return longest
}
