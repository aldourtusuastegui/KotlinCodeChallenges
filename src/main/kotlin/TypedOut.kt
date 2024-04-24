import java.util.LinkedList
import java.util.Queue
import java.util.Stack

/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

Example 3:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

* */


fun main() {
   println(backspaceCompareOptimalSolution("aza#bb##","az#z"))
    println(backspaceCompare("aza#bb##","az#z"))
}

fun backspaceCompareOptimalSolution(s: String, t: String): Boolean {
    var p1 = s.length -1
    var p2 = t.length -1

    while (p1 >=0 || p2 >=0) {
        if (s[p1]=='#' || t[p2]=='#') {
            if (s[p1]=='#') {
                var backCount = 2
                while (backCount>0) {
                    p1--
                    backCount--

                    if (s[p1]=='#') {
                        backCount = backCount+2
                    }
                }
            }

            if (t[p2] == '#') {
                var backCount = 2

                while (backCount > 0) {
                    p2--
                    backCount--

                    if (t[p2] == '#') {
                        backCount += 2
                    }
                }
            }
        }
        else {
            if (s[p1] != t[p2]) {
                return false
            } else {
                p1--
                p2--
            }
        }
    }


    return true
}

//ab#z az#z
fun backspaceCompare(s: String, t: String): Boolean {
    val final1 = getStringCleaned(s)
    val final2 = getStringCleaned(t)
    return final1==final2
}

fun getStringCleaned(s: String) : String {
    val finalString = mutableListOf<Char>()
    s.forEachIndexed { _, value ->
        if (value!='#') {
            finalString.add(value)
        } else {
            if (finalString.isNotEmpty()) finalString.removeLast()
        }
    }
    return finalString.toString()
}