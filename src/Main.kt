import arrays.SortedSquaredArray
import binarysearch.BinarySearchAlgo
import linkedlist.DoublyLinkedList
import linkedlist.LinkedList
import linkedlist.Node
import linkedlist.RemoveKthElement
import linkedlist.sumOfLinkedLists
import recursion.Permutations
import sorting.InsertionSort
import sorting.SelectionSort
import stack.BalancedBrackets
import stack.MinMaxStack

//import linkedlist.ProgramTest

/**
 * https://github.com/Tarun72/algoexpert_03_10_25.git
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
        val input = listOf(-10, -5, 0, 5, 10)
//        val expected = listOf(0, 25, 25, 100, 100)

//    val input = listOf(1, 2, 3, 5, 6, 8, 9)
    val expected = listOf(0, 25, 25, 100, 100)
        val output = SortedSquaredArray().sortedSquaredArray(input)
        println("Sorted SquaredArray: output $output")
    }


