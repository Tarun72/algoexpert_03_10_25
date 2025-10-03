package arrays

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

/**
 * completed on 3-10-2025
 */
class TwoSumProblem(
    override val problemUrl: String = "https://www.algoexpert.io/questions/two-number-sum",
    override val problemDescription: String = "Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.\n" +
            "\n" +
            "If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any order.\n" +
            "\n" +
            "If no two numbers sum up to the target sum, the function should return an empty array.\n" +
            "\n" +
            "Note that the target sum has to be obtained by summing two different integers in the array.\n" +
            "\n" +
            "You can’t add a single integer to itself in order to obtain the target sum.\n" +
            "\n" +
            "You can assume that there will be at most one pair of numbers summing up to the target sum.",
    override val type: ProblemType = ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Arrays,
    override val problemNumber: Int =  1
) : BaseInformation(){


    fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
        val map: MutableMap<Int, Int> = mutableMapOf()
        val result = mutableListOf<Int>()
        array.forEachIndexed { index, value ->
            val remaining = targetSum - value
            if (map.contains(remaining)) {
                result.add(value)
                result.add(remaining)
            } else map[value] = remaining
        }
        return result
    }

}