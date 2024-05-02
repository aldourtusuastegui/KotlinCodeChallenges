/*
Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true

Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
}

fun isPalindrome(s: String): Boolean {
    val regex = Regex("[^a-zA-Z0-9]")
    val cleanedString = s.replace(regex,"").lowercase()
    println(cleanedString)

    var p1 = 0
    var p2 = cleanedString.length -1
    while (p1 < p2) {
        if (cleanedString[p1]!=cleanedString[p2]) {
            return false
        }
        p1++
        p2--
    }
    return true
}