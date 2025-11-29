package arrays

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

class SortedSquaredArray(
    override val problemUrl: String = "https://www.algoexpert.io/questions/sorted-squared-array",
    override val problemDescription: String = "Write a function that takes in a non-empty array of integers that are sorted in ascending order, and returns a new array of the same length containing the squares of the original integers, also sorted in ascending order.",
    override val type: ProblemType = ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Arrays,
    override val problemNumber: Int = 20
) : BaseInformation() {
    //array = [-2, 3, 5, 6, 8, 9]
    fun sortedSquaredArray(array: List<Int>): List<Int> {
       val result = mutableListOf<Int>()
        array.forEach {
            result.add(0)
        }
        var startIndex = 0
        var endIndex = array.size - 1
        var insertionIndex = array.size - 1
        while (startIndex < endIndex) {
            val startValue = array[startIndex] * array[startIndex]
            val endValue = array[endIndex] * array[endIndex]
            if(startValue > endValue) {
                result[insertionIndex] =  startValue
                startIndex ++
            }else if(startValue < endValue) {
                result[insertionIndex] =  startValue
                endIndex --
            }else {
                result[insertionIndex--] =  endValue
                result[insertionIndex] =  startValue
                startIndex += 1
                endIndex -= 1
            }
            insertionIndex --
        }
           return result.toMutableList()
    }


}