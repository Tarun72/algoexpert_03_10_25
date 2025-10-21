package linkedlist

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType
/**
 * completed on 21-10-2025
 */
class MiddleNode(
    override val problemUrl: String = "https://www.algoexpert.io/questions/middle-node",
    override val problemDescription: String = "You’re given a Linked List with at least one node.\n" +
            "Write a function that returns the middle node of the Linked List.\n" +
            "\n" +
            "If there are two middle nodes in an even-length list, your function should return the second of these nodes.\n" +
            "\n" +
            "Each LinkedList node has:\n" +
            "\n" +
            "an integer value, and\n" +
            "\n" +
            "a next node pointing to the next node in the list or to null if it’s the tail of the list.",
    override val type: ProblemType = ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Linked_Lists,
    override val problemNumber: Int = 5
) : BaseInformation() {

    fun middleNode(linkedList: LinkedList): LinkedList {
        // Write your code here.
        return middleNodeHelper(linkedList)?:LinkedList(-1)
    }

    fun middleNodeHelper(linkedList: LinkedList): LinkedList? {
        var slowPointer: LinkedList? =  linkedList
        var fastPointer: LinkedList? = linkedList
        while (fastPointer?.next != null) {
            slowPointer = slowPointer?.next
            fastPointer = fastPointer?.next?.next

        }
        return slowPointer
    }


}