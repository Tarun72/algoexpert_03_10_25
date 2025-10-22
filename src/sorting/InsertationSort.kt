package sorting

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

class InsertationSort(
    override val problemUrl: String = "https://www.algoexpert.io/questions/insertion-sort",
    override val problemDescription: String = "Write a function that takes in an array of integers and returns a sorted version of that array.\n" +
            "Use the Insertion Sort algorithm to sort the array.",
    override val type: ProblemType = ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Sorting,
    override val problemNumber: Int = 7
) : BaseInformation(){

    fun insertionSort(array: MutableList<Int>): List<Int> {
        //8, 5, 2, 9, 5, 6, 3
        for(i in 0 until array.size){
            var j = i
            while (j>0){
//                println("value of j $j and array  ${array[j]} and value of i $i and array ${array[i]} and expression value is ${array[i] >= array[j]} ")
                if(array[j] < array[j-1]){
                    var temp = array[j-1]
                    array[j-1] = array[j]
                    array[j] = temp
                }
                j--
            }
//            println("")

        }
        return array
    }
}