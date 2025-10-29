package stack

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType
/**
 * started on 28-10-2025
 */
class MinMaxStack(
    override val problemUrl: String = "https://www.algoexpert.io/questions/min-max-stack-construction",
    override val problemDescription: String = "Write a MinMaxStack class for a Min Max Stack.\n" +
            "The class should support the following operations:\n" +
            "\n" +
            "push(number) – Push a number onto the stack.\n" +
            "\n" +
            "pop() – Remove the top number from the stack.\n" +
            "\n" +
            "peek() – Get the top number without removing it.\n" +
            "\n" +
            "getMin() – Retrieve the minimum value in the stack at any given point in time.\n" +
            "\n" +
            "getMax() – Retrieve the maximum value in the stack at any given point in time.",
    override val type: ProblemType = ProblemType.Medium,
    override val programCategory: ProblemCategory = ProblemCategory.Stack,
    override val problemNumber: Int = 10
) : BaseInformation() {
    var stackAsArray: MutableList<Int> = mutableListOf<Int>()
    var lastIndex = -1
    var minimumNumberInStack: Int = Integer.MAX_VALUE
    var maxNumberInStack: Int = Integer.MIN_VALUE
    fun peek(): Int? {
        return stackAsArray[lastIndex]
    }

    fun pop(): Int? {
        val item = stackAsArray[lastIndex]
        stackAsArray.removeAt(lastIndex)
        lastIndex--
        if(item ==  minimumNumberInStack) {
            var newMinimumNumber = Integer.MAX_VALUE
            stackAsArray.forEach {
                if(it < newMinimumNumber) {
                    newMinimumNumber = it
                }
            }
            minimumNumberInStack = newMinimumNumber
        }
        if(item == maxNumberInStack) {
            var newMinimumNumber = -1
            stackAsArray.forEach {
                if(it > newMinimumNumber) {
                    newMinimumNumber = it
                }
            }
            maxNumberInStack = newMinimumNumber
        }
        return item

    }

    fun push(number: Int) {
        stackAsArray.add(number)
        lastIndex ++
        if(number > maxNumberInStack){
            maxNumberInStack = number
        }

        if(number < minimumNumberInStack){
            minimumNumberInStack = number
        }
    }

    fun getMin(): Int? {
        return   if(minimumNumberInStack == Integer.MAX_VALUE){
          -1
        }else minimumNumberInStack
    }

    fun getMax(): Int? {
        return  if(maxNumberInStack == Integer.MIN_VALUE)
            -1
        else  maxNumberInStack
    }
}