package sorting

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

/**
 * Completed 25 November 2025
 */
class ThreeNumberSort(
    override val problemUrl: String = "https://www.algoexpert.io/questions/three-number-sort",
    override val problemDescription: String = "Prompt\n" +
            "\n" +
            "You’re given an array of integers and another array of three distinct integers.\n" +
            "\n" +
            "The first array is guaranteed to contain only integers that appear in the second array.\n" +
            "\n" +
            "The second array represents the desired order for the integers in the first array.\n" +
            "\n" +
            "For example, if:\n" +
            "\n" +
            "order = [x, y, z]\n" +
            "\n" +
            "\n" +
            "then all x values in the first array should come first, followed by all y values, followed by all z values.\n" +
            "\n" +
            "Requirements\n" +
            "\n" +
            "Write a function that sorts the first array in place according to the desired order from the second array.\n" +
            "\n" +
            "The function must run with constant auxiliary space → O(1) space.\n" +
            "\n" +
            "The input array must be modified in place (no new array allocation).\n" +
            "\n" +
            "The desired order will not always be ascending or descending.\n" +
            "\n" +
            "The input array might not contain all three values — it might contain only one or two.",
    override val type: ProblemType = ProblemType.Medium,
    override val programCategory: ProblemCategory = ProblemCategory.Sorting,
    override val problemNumber: Int = 18
) : BaseInformation(){
    /**
     * FIrst Solutions
     */
   /* fun threeNumberSort(array: MutableList<Int>, order: List<Int>): List<Int> {
        var startPointer = 0
        var endPointer =  array.size -1
        var midPointer = 0
        var resultArray : MutableList<Int> = mutableListOf()
        order.forEach { _order->
            array.forEach { _array ->
                if( _order == _array){
                    resultArray.add(_order)
                }

            }
        }
        return resultArray
    }*/

    /**
     * Second Solution
     */
    fun threeNumberSort(array: MutableList<Int>, order: List<Int>): List<Int> {
        var startPointer = 0
        var endPointer = 0
        var midPointer = 0
        array.forEach { _array ->
            if(order[0] == _array){
                startPointer ++
            }
            if(order[1] == _array){

                midPointer ++
            }
            if( order[2] == _array){
                endPointer ++
            }
        }

        for (i in array.indices){
            if(i < startPointer){
                array[i] = order[0]
            }
            else if(i < (startPointer + midPointer)){
                array[i] = order[1]
            }
            else if(i < (startPointer + midPointer + endPointer)){
                array[i] = order[2]
            }
            //println("after every iteration ${array[i]} and index is $i")
        }
        return array
    }
}