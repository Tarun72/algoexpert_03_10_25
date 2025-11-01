package stack

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType
import java.util.Stack

/**
 * completed on 1-11-2025
 */
class BalancedBrackets(
    override val problemUrl: String = "https://www.algoexpert.io/questions/balanced-brackets",
    override val problemDescription: String = "Write a function that takes in a string made up of brackets — (, ), {, }, [ , ] — and other optional characters.\n" +
            "The function should return a boolean representing whether the string is balanced with regards to brackets.\n" +
            "\n" +
            "A string is said to be balanced if it has as many opening brackets of a certain type as it has closing brackets of that type, and if no bracket is unmatched.\n" +
            "\n" +
            "A closing bracket cannot appear before its corresponding opening bracket, and brackets cannot overlap each other (for example, [(]) is invalid).",
    override val type: ProblemType = ProblemType.Medium,
    override val programCategory: ProblemCategory = ProblemCategory.Stack,
    override val problemNumber: Int = 12
) : BaseInformation(){

    fun balancedBrackets(str: String): Boolean {
        val stack = Stack<Char>()
        str.forEach { character->
            if(stack.isEmpty() && (character == '}' || character == ']' || character == ')')){
                return false
            }

                if(stack.isNotEmpty() && (character == '}' || character == ']' || character == ')')){
              val openingBrackets:Char =  stack.pop()
                if(openingBrackets == '{' && character == '}'){

                }else if(openingBrackets == '(' && character == ')'){

                }else if(openingBrackets == '[' && character == ']'){

                }else{
                    return false
                }

            }else{
                if(character == '{' || character == '[' || character == '('){
                stack.push(character)
                }
            }
        }
        if(!stack.isEmpty()){
            return false
        }
        return true
    }
}