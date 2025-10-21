package linkedlist

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

class RemoveDuplicates(
    override val problemUrl: String = "https://www.algoexpert.io/questions/remove-duplicates-from-linked-list",
    override val problemDescription: String = "You’re given the head of a Singly Linked List whose nodes are in sorted order with respect to their values.\n" +
            "\n" +
            "Write a function that returns a modified version of the Linked List that doesn’t contain any nodes with duplicate values.\n" +
            "\n" +
            "The Linked List should be modified in place (i.e., you shouldn’t create a brand new list), and the modified Linked List should still have its nodes sorted with respect to their values.\n" +
            "\n" +
            "Each LinkedList node has an integer value as well as a next node pointing to the next node in the list or to null if it’s the tail of the list.",
    override val type: ProblemType = ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Linked_Lists,
    override val problemNumber: Int = 2
) : BaseInformation()

// This is an input class. Do not edit.
open class LinkedList(value: Int) {
    var value = value
    var next: LinkedList? = null
    override fun toString(): String {
        return "value ${value} and next $next"
    }
}

fun removeDuplicatesFromLinkedList(linkedList: LinkedList): LinkedList {
    val head = linkedList
    var current: LinkedList? = linkedList
    var previous: LinkedList? = null
    while (current != null) {
        if (previous != null && previous.value == current.value) {
            previous.next = current.next
        } else {
            previous = current

        }
        current = current?.next
    }

    return head
}
//
//class ProgramTest {
//    fun TestCase1() {
//        val input = addMany(LinkedList(1), listOf(1, 3, 4, 4, 4, 5, 6, 6))
//        val expected = addMany(LinkedList(1), listOf(3, 4, 5, 6))
//        val output = removeDuplicatesFromLinkedList(input)
//        println(output)
//
//    }
//}
//
//fun addMany(linkedList: LinkedList, values: List<Int>): LinkedList {
//    var current = linkedList
//    while (current.next != null) {
//        current = current.next!!
//    }
//    for (value in values) {
//        current.next = LinkedList(value)
//        current = current.next!!
//    }
//    return linkedList
//}
//
//fun getNodesInArray(linkedList: LinkedList?): List<Int> {
//    val nodes = mutableListOf<Int>()
//    var current: LinkedList? = linkedList
//    while (current != null) {
//        nodes.add(current.value)
//        current = current.next
//    }
//    return nodes
//}
