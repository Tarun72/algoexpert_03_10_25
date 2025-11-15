package arrays

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

/**
 * completed on 15-11-2025
 */
class ValidateSubsequence(
    override val problemUrl: String = "https://www.algoexpert.io/questions/validate-subsequence",
    override val problemDescription: String = "Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.\n" +
            "\n" +
            "A subsequence of an array is a set of numbers that aren’t necessarily adjacent, but that appear in the array in the same order as they appear in the subsequence.\n" +
            "For example:\n" +
            "\n" +
            "[1, 3, 4] is a subsequence of [1, 2, 3, 4]\n" +
            "\n" +
            "[2, 4] is also a subsequence of [1, 2, 3, 4]\n" +
            "\n" +
            "The entire array itself is trivially a subsequence",
    override val type: ProblemType= ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Arrays,
    override val problemNumber: Int = 15
) : BaseInformation() {

    fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
        // Write your code here.
        var counterj =0
        for (i in array.indices) {
            if(counterj > sequence.size-1){
                break
            }
            if(array[i] == sequence[counterj]) {
                counterj++
            }
        }
            if(counterj >= sequence.size ) {
                return true
            } else{
                return false
            }
    }

}