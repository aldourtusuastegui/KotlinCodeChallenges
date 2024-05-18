fun main() {
  println(gradingStudents(arrayOf(73,67,38,33)).toList())
}

// Write your code here
// less than 40 is a failed grade
// round less than 3 points as difference.
// find the next number that is multiple of 5. ok
fun gradingStudents(grades: Array<Int>): Array<Int> {
     //73,67,38,33 = 75,67,40,33
    //foreach
    //validations 0(n) solution
    grades.forEachIndexed { index, grade ->
        //find the multiple of 5.
        val multipleNumber = ((grade/5)+1) * 5
        val difference = multipleNumber-grade

        if (difference<3 && multipleNumber>=40) {
            grades[index] = multipleNumber
        }
    }
    return grades
}