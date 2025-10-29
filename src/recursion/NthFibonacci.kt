package recursion

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType

/**
 * completed on 27-10-2025
 */
class NthFibonacci(
    override val problemUrl: String = "https://www.algoexpert.io/questions/nth-fibonacci",
    override val problemDescription: String = "The Fibonacci sequence is defined as follows:\n" +
            "\n" +
            "The first number of the sequence is 0.\n" +
            "\n" +
            "The second number of the sequence is 1.\n" +
            "\n" +
            "The nth number is the sum of the (n-1)th and (n-2)th numbers.",
    override val type: ProblemType =  ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Recursion,
    override val problemNumber: Int = 9
) : BaseInformation(){
    fun getNthFib(n: Int): Int {

        if(n == 1){
            return  0
        }
        if(n == 2){
            return 1
        }

        return getNthFib(n-1) + getNthFib(n-2)
    }

}