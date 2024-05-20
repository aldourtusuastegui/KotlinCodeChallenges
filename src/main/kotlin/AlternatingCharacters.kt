fun main() {
    println(alternatingCharacters("AAABBB"))
}

fun alternatingCharacters(s: String): Int {
    //return the number of deletions required to avoid repeated characters
    // Write your code here
    // letters always are A and B
    // we could save in a val the previous value. A or B.
    // and compare with the current position if are equals
    // if values are equals, do not update val and increase counter
    // else val change values
    var currentLetter = s.first()
    var stepsToDelete = 0
    for (i in 1..<s.length) {
        if (currentLetter==s[i]) {
            stepsToDelete++
        } else {
            currentLetter = s[i]
        }
    }
    return stepsToDelete
}