package linkedlist

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

class SumOfLinkedList(
    override val problemUrl: String = "https://www.algoexpert.io/questions/sum-of-linked-lists",
    override val problemDescription: String = "You’re given two linked lists of potentially unequal length. Each linked list represents a non-negative integer, where each node in the list is a single digit. The head node represents the least significant digit of the number (i.e., the lists store digits in reverse order).\n" +
            "\n" +
            "Write a function that takes in the two linked lists and returns a new linked list representing the sum of the two numbers.\n" +
            "\n" +
            "Each LinkedList node has an integer value (0–9) and a next pointer to the next node or null / None.\n" +
            "\n" +
            "The returned linked list should also have its head represent the least significant digit.\n" +
            "\n" +
            "You may assume the input linked lists are non-empty.",
    override val type: ProblemType = ProblemType.Medium,
    override val programCategory: ProblemCategory = ProblemCategory.Linked_Lists,
    override val problemNumber: Int = 16
) : BaseInformation() {

}

// This is an input class. Do not edit.
open class LinkedList(value: Int) {
    var value = value
    var next: LinkedList? = null
}

//val ll1 = addMany(LinkedList(4), listOf(6, 9, 3, 1))
//val ll2 = addMany(LinkedList(0), listOf(0, 0, 0, 2, 7))

//fun sumOfLinkedLists(linkedListOne: LinkedList, linkedListTwo: LinkedList): LinkedList {
//    var counterone: LinkedList? = linkedListOne
//    var counterTwo: LinkedList? = linkedListTwo
//    var isCarryActive = false
//    while (counterTwo != null && counterone != null) {
//        var currentSum = counterone.value + counterTwo.value
//        var finalSum = currentValue(currentSum, isCarryActive)
//        isCarryActive = isCarryRequiredInNextIteration(currentSum, isCarryActive)
//
//        counterone.value = finalSum
//        counterTwo = counterTwo.next
//        counterone = counterone.next
//    }
//
//    if (counterone != null) {
//        while (counterone != null) {
//            var finalSum = currentValue(counterone.value, isCarryActive)
//            isCarryActive = finalSum > 10
//
//            counterone.value = finalSum
//            counterTwo = counterTwo?.next
//            counterone = counterone.next
//        }
//    }
//
//    if (counterTwo != null) {
//        while (counterTwo != null) {
//            var finalSum = currentValue(counterTwo.value, isCarryActive)
//            isCarryActive = finalSum > 10
//            counterone = LinkedList(finalSum)
//            counterTwo = counterTwo?.next
//            counterone = counterone?.next
//        }
//    }
//
//    if (isCarryActive) {
//        linkedListOne?.next = LinkedList(1)
//    }
//    return linkedListOne
//}
//
//fun currentValue(currentSum: Int, isCarryActive: Boolean): Int {
//    var finalSum = 0
//    if (currentSum > 10) {
//        finalSum = currentSum - 10
//        if (isCarryActive) {
//            finalSum += 1
//        }
//    } else {
//        finalSum = currentSum
//        if (isCarryActive) {
//            finalSum += 1
//        }
//    }
//    return finalSum
//}
//
//fun isCarryRequiredInNextIteration(currentSum: Int, isCarryActive: Boolean): Boolean {
//    return currentSum > 10
//}

fun sumOfLinkedLists(linkedListOne: LinkedList, linkedListTwo: LinkedList): LinkedList {
    var p: LinkedList? = linkedListOne
    var q: LinkedList? = linkedListTwo
    var carry = 0
    var prev: LinkedList? = null
    val head = linkedListOne

    while (p != null || q != null || carry != 0) {
        val x = p?.value ?: 0
        val y = q?.value ?: 0
        val sum = x + y + carry

        val digit = sum % 10
        carry = sum / 10

        if (p != null) {
            // overwrite existing node in linkedListOne
            p.value = digit
            prev = p
            p = p.next
        } else {
            // linkedListOne ended, append new node using prev
            prev!!.next = LinkedList(digit)
            prev = prev.next
            // p remains null (we just appended), so advance p to prev.next
            p = prev?.next
        }
        // advance q
        q = q?.next
    }

    return head
}
















