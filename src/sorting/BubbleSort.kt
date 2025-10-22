package sorting

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

/**
 * completed on 22-10-2025
 */
class BubbleSort(
    override val problemUrl: String = "https://www.algoexpert.io/questions/bubble-sort",
    override val problemDescription: String = "Write a function that takes in an array of integers and returns a sorted version of that array.\n" +
            "Use the Bubble Sort algorithm to sort the array.\n" +
            "\n" +
            "If you’re unfamiliar with Bubble Sort, we recommend watching the conceptual overview section of this question before starting to code.",
    override val type: ProblemType = ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Sorting,
    override val problemNumber: Int = 6
) : BaseInformation(){

    fun bubbleSort(array: MutableList<Int>): List<Int> {
        // Write your code here.
        for(i in 0 until array.size){
            for (j in 0 until array.size){
                if(array[i] > array[j]){
                    var temp = array[j]
                    array[j] = array[i]
                    array[i] = temp
                }
            }
        }
        return array
    }
}