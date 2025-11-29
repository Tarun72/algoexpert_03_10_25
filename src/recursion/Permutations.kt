package recursion

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

/**
 * https://www.youtube.com/watch?v=H232aocj7bQ
 */
class Permutations(
    override val problemUrl: String = "https://www.algoexpert.io/questions/permutations",
    override val problemDescription: String = "Write a function that takes in an array of unique integers and returns an array of all permutations of those integers, in no particular order.\n" +
            "\n" +
            "If the input array is empty, the function should return an empty array.",
    override val type: ProblemType = ProblemType.Medium,
    override val programCategory: ProblemCategory= ProblemCategory.Recursion,
    override val problemNumber: Int = 19
) : BaseInformation() {

    fun getPermutations(array: List<Int>): List<List<Int>> {
        // Write your code here.
        val permutations = mutableListOf<List<Int>>()
        backTrackingHelper(array,permutations, mutableListOf<Int>())
        return permutations
    }

    private fun backTrackingHelper(
        array: List<Int>,
        permutations: MutableList<List<Int>>,
        result: MutableList<Int>
    ) {
            if(result.size == array.size) {
                permutations.add(ArrayList(result))
                return
            }


        for(elements in array) {
            if(result.contains(elements))
                continue

            result.add(elements)
            backTrackingHelper(array,permutations,result)
            result.removeAt(result.size - 1)
        }
    }


// 1,2,3
// 1, 3, 2
// 2, 1, 3
// 2,3,1
// 3, 1 ,2
// 3, 2, 1
}











