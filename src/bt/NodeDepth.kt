package bt

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

class NodeDepth(
    override val problemUrl: String = "https://www.algoexpert.io/questions/node-depths",
    override val problemDescription: String = "The distance between a node in a Binary Tree and the tree’s root is called the node’s depth.\n" +
            "\n" +
            "Write a function that takes in a Binary Tree and returns the sum of its nodes’ depths.\n" +
            "\n" +
            "Each BinaryTree node has:\n" +
            "\n" +
            "an integer value,\n" +
            "\n" +
            "a left child node, and\n" +
            "\n" +
            "a right child node.\n" +
            "\n" +
            "Children nodes can either be BinaryTree nodes themselves or null/None.",
    override val type: ProblemType = ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Binary_Trees,
    override val problemNumber: Int = 4
) : BaseInformation(){


    fun nodeDepths(root: BinaryTree): Int {
        // Write your code here.
        val result  =   nodeDepthHelper(root, sum =  0 )
        return result
    }

    fun nodeDepthHelper(root: BinaryTree, sum: Int): Int {
        var leftSum = 0
        var rightSum = 0
        if(root.left == null && root.right == null) {
            return sum
        }
        if (root.left != null) {
         leftSum =  nodeDepthHelper(root.left!!, sum +1)
        }
        if (root.right != null) {
          rightSum =  nodeDepthHelper(root.right!!, sum + 1)
        }
        return leftSum + rightSum +sum
    }

}