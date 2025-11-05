package linkedlist

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType
/**
 * completed on 5-11-2025
 */
class RemoveKthElement(
    override val problemUrl: String= "https://www.algoexpert.io/questions/remove-kth-node-from-end",
    override val problemDescription: String = "Write a function that takes in the head of a Singly Linked List and an integer k, and removes the k<sup>th</sup> node from the end of the list. The removal should be done in place (no new list).\n" +
            "\n" +
            "The input head of the linked list should remain the head of the linked list after the removal is done, even if the head is the node that's supposed to be removed — in that case your function should simply mutate the head node's value and next pointer.\n" +
            "\n" +
            "Each LinkedList node has an integer value as well as a next node pointer.\n" +
            "\n" +
            "You can assume the input linked list will always have at least k nodes and, more specifically, at least two nodes.\n" +
            "\n" +
            "Your function does not need to return anything.",
    override val type: ProblemType = ProblemType.Medium,
    override val programCategory: ProblemCategory = ProblemCategory.Linked_Lists,
    override val problemNumber: Int  = 13
) : BaseInformation() {

    fun removeKthNodeFromEnd(head: LinkedList, k: Int) {
        // Write your code here.
        var currentNode: LinkedList? = head
        var KthCounterNode: LinkedList? =  head
        var  previousNode: LinkedList? = null
        var kcounter = 1
        var headForSomething = head

        while (currentNode != null){
            println(kcounter)
            currentNode = currentNode.next
            if(kcounter <= k){
                println(" before increment $kcounter")
                kcounter++
            }else{
                previousNode = KthCounterNode
                KthCounterNode = KthCounterNode?.next
            }
        }
        println("previousNode: ${previousNode?.value}   and kthCounterNode : ${KthCounterNode?.value}")
        previousNode?.next = KthCounterNode?.next
        if(previousNode == null){
            head.value = head.next?.value!!
            head.next = head.next?.next
        }
        println("head: ${head?.value}")
    }
}