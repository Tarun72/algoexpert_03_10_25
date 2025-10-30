package strings

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType
/**
 * completed on 30-10-2025
 */
class Palindrome(
    override val problemUrl: String = "https://www.algoexpert.io/questions/palindrome-check",
    override val problemDescription: String = "Category: Strings\n" +
            "Difficulty: Easy\n" +
            "\n" +
            "Prompt\n" +
            "\n" +
            "Write a function that takes in a non-empty string and returns a boolean representing whether the string is a palindrome.\n" +
            "\n" +
            "A palindrome is defined as a string that’s written the same forward and backward.\n" +
            "Note that single-character strings are palindromes.",
    override val type: ProblemType = ProblemType.Easy,
    override val programCategory: ProblemCategory =  ProblemCategory.String,
    override val problemNumber: Int = 11
) : BaseInformation() {

    fun isPalindrome(string: String): Boolean {
        var startIndex = 0
        var endIndex =  string.length -1
        if(string.isEmpty()){
            return true
        }
        while (startIndex < endIndex){
            val s =  string.get(startIndex)
            val e =  string.get(endIndex)
            if(s != e){
                return false
            }
            startIndex ++
            endIndex --
        }
        return true
    }
}