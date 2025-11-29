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

    val input = listOf(1, 2, 3)
    val output = Permutations().getPermutations(input)
    assert(output.size == 6)
    assert(output.contains(listOf(1, 2, 3)))
    assert(output.contains(listOf(1, 3, 2)))
    assert(output.contains(listOf(2, 1, 3)))
    assert(output.contains(listOf(2, 3, 1)))
    assert(output.contains(listOf(3, 1, 2)))
    assert(output.contains(listOf(3, 2, 1)))
    output.forEach { println(it) }
//    val array = listOf(0, 1, 21, 33, 45, 45, 61, 71, 72, 73)
//    val target = 33
//    val expected = 3
//    val output =  BinarySearchAlgo().binarySearch(array, target)
//    println("expected: $expected, output: $output")

//    val ll1 = addMany(LinkedList(2), listOf(4, 7, 1))
//    val ll2 = addMany(LinkedList(9), listOf(4, 5))
//    val expected = addMany(LinkedList(1), listOf(9, 2, 2))
//    val output = sumOfLinkedLists(ll1, ll2)
//    assert(getNodesInArray(expected) == getNodesInArray(output))

//    val ll1 = LinkedList(2)
//    val ll2 = LinkedList(9)
//
//    val expected = LinkedList(1)
//    expected.next = LinkedList(1)
//
//    val output = sumOfLinkedLists(ll1, ll2)
//
//    assert(getNodesInArray(expected) == getNodesInArray(output))

//
//    val ll1 = addMany(LinkedList(4), listOf(6, 9, 3, 1))
//    val ll2 = addMany(LinkedList(0), listOf(0, 0, 0, 2, 7))
//
//// Expected: 4 → 6 → 9 → 3 → 3 → 7
//    val expected = LinkedList(4)
//    expected.next = LinkedList(6)
//    expected.next!!.next = LinkedList(9)
//    expected.next!!.next!!.next = LinkedList(3)
//    expected.next!!.next!!.next!!.next = LinkedList(3)
//    expected.next!!.next!!.next!!.next!!.next = LinkedList(7)
//
//    val output = sumOfLinkedLists(ll1, ll2)
//
////    assert(getNodesInArray(expected) == getNodesInArray(output))
//    getNodesInArray(output)
}



fun addMany(linkedList: LinkedList, values: List<Int>): LinkedList {
    var current = linkedList
    while (current.next != null) {
        current = current.next!!
    }
    for (value in values) {
        current.next = LinkedList(value)
        current = current.next!!
    }
    return linkedList
}

fun getNodesInArray(linkedList: LinkedList?): List<Int> {
    val nodes = mutableListOf<Int>()
    var current: LinkedList? = linkedList
    while (current != null) {
        println("current: ${current.value}")
        nodes.add(current.value)
        current = current.next
    }
    return nodes
}

