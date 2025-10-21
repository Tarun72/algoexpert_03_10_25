package bt

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

/**
 * tree =
 *           1
 *         /   \
 *        2     3
 *      /  \   / \
 *     4    5 6   7
 *    / \  /
 *   8  9 10
 *
 * [15, 16, 18, 10, 11]
 *
 */
class BranchSums(
    override val problemUrl: String = "https://www.algoexpert.io/questions/branch-sums",
    override val problemDescription: String = "Write a function that takes in a Binary Tree and returns a list of its branch sums ordered from the leftmost branch sum to the rightmost branch sum.\n" +
            "\n" +
            "A branch sum is the sum of all values in a Binary Tree branch.\n" +
            "A Binary Tree branch is a path of nodes in a tree that starts at the root node and ends at any leaf node.\n" +
            "\n" +
            "Each BinaryTree node has an integer value, a left child node, and a right child node.\n" +
            "Children nodes can either be BinaryTree nodes themselves or null/None.",
    override val type: ProblemType = ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Binary_Trees,
    override val problemNumber: Int = 3
) : BaseInformation(){


    fun branchSums(root: BinaryTree): List<Int> {
        val result = mutableListOf<Int>()
        branchSumHelper(root, 0 ,result )
        return result
    }

    fun branchSumHelper(tree: BinaryTree?, currentSum:Int, result:MutableList<Int>){
        if(tree?.value != null){
            var updatedSum = currentSum + tree.value
            if(tree.left == null && tree.right == null){
                result.add(updatedSum)
            }
            if(tree.left != null){
                branchSumHelper(tree.left, updatedSum,result)

            }
            if(tree.right != null){
                branchSumHelper(tree.right, updatedSum,result)

            }
        }
    }

}

open class BinaryTree(value: Int) {
    var value = value
    var left: BinaryTree? = null
    var right: BinaryTree? = null
}

