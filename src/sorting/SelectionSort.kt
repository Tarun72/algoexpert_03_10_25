package sorting

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

/**
 * completed on 25-10-2025
 */
class SelectionSort(
    override val problemUrl: String = "https://www.algoexpert.io/questions/selection-sort",
    override val problemDescription: String =  "Write a function that takes in an array of integers and returns a sorted version of that array.\n" +
            "Use the Selection Sort algorithm to sort the array.",
    override val type: ProblemType = ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Sorting,
    override val problemNumber: Int = 8
) : BaseInformation(){
    fun selectionSort(array: MutableList<Int>): List<Int> {
        //8, 5, 2, 9, 5, 6, 3)
       for(i in 0 until array.size){
            var smallest = array[i]
            var index = -1
            for(j in i+1 until array.size){
                if(array[j] < smallest){
                    smallest = array[j]
                    index = j
                }
            }

            if(index != -1){
                val temp  =  array[i]
                array[i] = array[index]
                array[index] = temp
            }


        }

        return array
    }
}