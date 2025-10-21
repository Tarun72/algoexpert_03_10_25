package bst

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType
import bt.BinaryTree
import bt.NodeDepth
import kotlin.math.abs

class FindClosestValue(
    override val problemUrl: String = "https://www.algoexpert.io/questions/find-closest-value-in-bst",
    override val problemDescription: String = "Write a function that takes in a sorted array of integers as well as a target integer.\n" +
            "\n" +
            "The function should use the Binary Search algorithm to determine if the target integer is contained in the array and should return its index if it is, otherwise",
    override val type: ProblemType= ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Binary_Search_Trees,
    override val problemNumber: Int = 3
) : BaseInformation(){

}


open class BST(value: Int) {
    var value = value
    var left: BST? = null
    var right: BST? = null
}

fun findClosestValueInBst(tree: BST?, target: Int): Int {
    var resultFromLeft = -1
    var resultFromRight = -1
    var rootResult = -1
    if(tree != null){
        val result  = tree.value - target
       rootResult =  abs(result)
    }else{
       return tree?.value?:-1
    }
    if(tree.left != null)
        resultFromLeft  = findClosestValueInBst(tree?.left,target)
    else if(tree?.right != null){
        resultFromRight = findClosestValueInBst(tree?.right,target)
    }

    if(resultFromLeft != -1 && resultFromRight != -1){
        return -1
    }
    if(resultFromRight>resultFromLeft){

           val left =  abs(resultFromLeft - target)
            if(left < rootResult){
                return resultFromLeft
            }else{
                return tree.value
            }


    }else if(resultFromLeft>resultFromRight){
            val left =  abs(resultFromRight - target)
            if(left < rootResult){
                return resultFromRight
            }else{
                return tree.value
            }
    }
    return -1
}

class ProgramTest {
    fun TestCase1() {
        val tree = BinaryTree(1)
        tree.left = BinaryTree(2)
        tree.right = BinaryTree(3)
        tree.left!!.left = BinaryTree(4)
        tree.left!!.right = BinaryTree(5)
        tree.right!!.left = BinaryTree(6)
        tree.right!!.right = BinaryTree(7)
        tree.left!!.left!!.left = BinaryTree(8)
        tree.left!!.left!!.right = BinaryTree(9)

        val result = NodeDepth().nodeDepths(tree)
        println("result: 1 $result")
        assert(result == 13)
    }
}
