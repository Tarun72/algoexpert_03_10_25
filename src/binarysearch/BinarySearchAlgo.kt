package binarysearch

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

class BinarySearchAlgo(
    override val problemUrl: String = "https://www.algoexpert.io/questions/binary-search",
    override val problemDescription: String = "Write a function that takes in a sorted array of integers as well as a target integer.\n" +
            "Use the Binary Search algorithm to determine whether the target integer is contained in the array.\n" +
            "\n" +
            "Return the index of the target if it is found.\n" +
            "Otherwise, return -1." ,
    override val type: ProblemType = ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.BinarySearch,
    override val problemNumber: Int = 17
) : BaseInformation(){


    fun binarySearch(array: List<Int>, target: Int): Int {
        var start = 0
        var end = array.size - 1
        while (start <= end) {
          var mid = (start + end) / 2
            if (array[mid] ==  target) {
                return mid
            }else if(array[mid] >  target) {
                end = mid - 1

            }else if(array[mid] < target) {
                start = mid + 1

            }
        }
        return -1
    }
}