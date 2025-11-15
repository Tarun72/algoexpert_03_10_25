package linkedlist

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

/**
 * started on 7th November 2025
 * needed to revise it
 */
class LinkedListConstructions(
    override val problemUrl: String = "https://www.algoexpert.io/questions/linked-list-construction",
    override val problemDescription: String = "Write a DoublyLinkedList class that has a head and a tail, both of which point to either a Node or None / null.\n" +
            "\n" +
            "The class should support the following operations:\n" +
            "\n" +
            "setHead(node) — Sets the given node as the head of the linked list.\n" +
            "\n" +
            "setTail(node) — Sets the given node as the tail of the linked list.\n" +
            "\n" +
            "insertBefore(node, nodeToInsert) — Inserts nodeToInsert before the given node.\n" +
            "\n" +
            "insertAfter(node, nodeToInsert) — Inserts nodeToInsert after the given node.\n" +
            "\n" +
            "insertAtPosition(position, nodeToInsert) — Inserts nodeToInsert at the given position (1-indexed).\n" +
            "\n" +
            "removeNodesWithValue(value) — Removes all nodes with the given value.\n" +
            "\n" +
            "remove(node) — Removes the given node from the linked list.\n" +
            "\n" +
            "containsNodeWithValue(value) — Returns a boolean indicating whether a node with the given value exists in the list.\n" +
            "\n" +
            "Each Node has:\n" +
            "\n" +
            "an integer value\n" +
            "\n" +
            "a prev node\n" +
            "\n" +
            "a next node\n" +
            "\n" +
            "Both prev and next may point to another node or be null.",
    override val type: ProblemType = ProblemType.Medium,
    override val programCategory: ProblemCategory = ProblemCategory.Linked_Lists,
    override val problemNumber: Int = 14
) : BaseInformation() {

}


class Node(value: Int) {
    val value = value
    var prev: Node? = null
    var next: Node? = null
}

class DoublyLinkedList {
    private var head: Node? = null
    private var tail: Node? = null

    fun setHead(node: Node) {
        if(head == null) {
            head = node
            head?.prev = null
            head?.next =  null
            tail = node
            tail?.next = null
            tail?.prev = null
        }else{
            if(containsNodeWithValue(node.value)){
              val node =  getNodeAfterRemoval(node)
                node.prev = null
                node.next = head
                head?.prev = node
                head =  node
            }else{
                node.prev = null
                node.next = head
                head?.prev = node
                head =  node
            }
        }
    }

    fun setTail(node: Node) {
        if(tail != null){
            tail?.next = node
            node.prev = tail
            node.next = null
            tail =  node
        }else{
            setHead(node)
        }
    }

    fun insertBefore(node: Node, nodeToInsert: Node) {
        if(containsNodeWithValue(nodeToInsert.value)){
            getNodeAfterRemoval(nodeToInsert)
            var isHeadNode =  false
            var isTailNode =  false
            if(node.prev == null){
                isHeadNode = true
            }
            if(node.next == null){
                isTailNode = true
            }

            val previousNode = node.prev
            previousNode?.next =  nodeToInsert
            node.prev = nodeToInsert
            nodeToInsert.next = node
            nodeToInsert.prev = previousNode
            if(isHeadNode){
                head = nodeToInsert
            }

        }
    }

    fun insertAfter(node: Node, nodeToInsert: Node) {
        if(containsNodeWithValue(nodeToInsert.value)) {
            getNodeAfterRemoval(nodeToInsert)
            var isTailNode =  false
            if(node.next == null) {
                isTailNode = true
            }
            val nextNode = node.next
            nodeToInsert.prev = node
            node.next = nodeToInsert
            nodeToInsert.next = nextNode
            if(isTailNode){
                tail = nodeToInsert
            }
        }else{
            var isTailNode =  false
            if(node.next == null) {
                isTailNode = true
            }
            val nextNode = node.next
            nodeToInsert.prev = node
            node.next = nodeToInsert
            nodeToInsert.next = nextNode
            if(isTailNode){
                tail = nodeToInsert
            }
        }

    }

    fun insertAtPosition(position: Int, nodeToInsert: Node) {
        if (position == 1) {
            setHead(nodeToInsert)
            return
        }

        var current = head
        var currentPosition = 1

        while (current != null && currentPosition != position) {
            current = current.next
            currentPosition++
        }

        if (current != null) {
            // We found the spot → insert before this node
            insertBefore(current, nodeToInsert)
        } else {
            // Position is out of range → insert at tail
            setTail(nodeToInsert)
        }
    }

    fun removeNodesWithValue(value: Int) {
        var currentNode = head
        while (currentNode != null){
            if(currentNode.value == value){
                if(currentNode.prev == null){
                  var nextCondonterForHead =   currentNode.next
                    remove(currentNode)
                    head =  nextCondonterForHead
                    nextCondonterForHead?.prev = null
                }else if(currentNode.next == null){
                    var nextCondonterForTail =   currentNode.prev
                    remove(currentNode)
                      tail = nextCondonterForTail
                    nextCondonterForTail?.next = null
                }else{
                    remove(currentNode)
                }
            }

            currentNode = currentNode.next

        }
    }

    fun remove(node: Node) {
        val prev = node.prev
        val nextNode = node.next
        prev?.next = node.next
        nextNode?.prev = prev
    }


    fun containsNodeWithValue(value: Int): Boolean {
        var counterNode = head
        while (counterNode != null) {
            if (counterNode.value == value) {
                return true
            }
            counterNode = counterNode.next
        }
        return false
    }


    fun getNodeAfterRemoval(node: Node): Node {
        var counterNode = head
        while (counterNode != null) {
            if (counterNode == node) {
                break
            }
            counterNode = counterNode.next
        }
        if (counterNode != null)
            remove(counterNode)
        return node
    }


    fun getHead(): Node? { return this.head }

    fun getTail(): Node? { return this.tail }
}