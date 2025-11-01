import sorting.InsertionSort
import sorting.SelectionSort
import stack.BalancedBrackets
import stack.MinMaxStack

//import linkedlist.ProgramTest

/**
 * https://github.com/Tarun72/algoexpert_03_10_25.git
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    BalancedBrackets().balancedBrackets(")[]}")

//    ProgramTest().TestCase1()
//    var array = mutableListOf(8, 5, 2, 9, 5, 6, 3)
//    print("$array")
////   val result =  InsertionSort().insertionSort(array)
//    val result = SelectionSort().selectionSort(array)
//    println()
//    println("result: $result")

//    val stack = MinMaxStack()
//    stack.push(5)
//    testMinMaxPeek(5, 5, 5, stack)
//    stack.push(7)
//    testMinMaxPeek(5, 7, 7, stack)
//    stack.push(2)
//    testMinMaxPeek(2, 7, 2, stack)
//    assert(stack.pop() == 2)
//    assert(stack.pop() == 7)
//    testMinMaxPeek(5, 5, 5, stack)

//    val stack = MinMaxStack()
//
//    stack.push(5)
//    println("pushed 5")
//    testMinMaxPeek(5, 5, 5, stack)
//
//    stack.push(5)
//    println("pushed 5")
//    testMinMaxPeek(5, 5, 5, stack)
//
//    stack.push(5)
//    println("pushed 5")
//    testMinMaxPeek(5, 5, 5, stack)
//
//    stack.push(5)
//    println("pushed 5")
//    testMinMaxPeek(5, 5, 5, stack)
//
//    stack.push(8)
//    println("pushed 8")
//
//    testMinMaxPeek(5, 8, 8, stack)
//
//    stack.push(8)
//    println("pushed 8")
//    testMinMaxPeek(5, 8, 8, stack)
//
//    stack.push(0)
//    println("pushed 0")
//    testMinMaxPeek(0, 8, 0, stack)
//
//    stack.push(8)
//    println("pushed 8")
//    testMinMaxPeek(0, 8, 8, stack)
//
//    stack.push(9)
//    println("pushed 9")
//    testMinMaxPeek(0, 9, 9, stack)
//
//    stack.push(5)
//    println("pushed 5")
//    testMinMaxPeek(0, 9, 5, stack)
//
//// Pops start
//    assert(stack.pop() == 5)
//    println("pop 5")
//    testMinMaxPeek(0, 9, 9, stack)
//
//    assert(stack.pop() == 9)
//    println("pop 9")
//    testMinMaxPeek(0, 8, 8, stack)
//
//    assert(stack.pop() == 8)
//    testMinMaxPeek(0, 8, 0, stack)
//
//    assert(stack.pop() == 0)
//    println("pop 0")
//    testMinMaxPeek(5, 8, 8, stack)
//
//    assert(stack.pop() == 8)
//    println("pop 8")
//    testMinMaxPeek(5, 8, 8, stack)
//
//    assert(stack.pop() == 8)
//    println("pop 8")
//    testMinMaxPeek(5, 5, 5, stack)
//
//    assert(stack.pop() == 5)
//    println("pop 5")
//
//    testMinMaxPeek(5, 5, 5, stack)
//
//    assert(stack.pop() == 5)
//    println("pop 5")
//
//    testMinMaxPeek(5, 5, 5, stack)
//
//    assert(stack.pop() == 5)
//    println("pop 5")
//
//    testMinMaxPeek(5, 5, 5, stack)
//
//    assert(stack.pop() == 5)
//    println("pop 5")

// stack is now empty



}


fun testMinMaxPeek(min: Int, max: Int, peek: Int, stack: MinMaxStack) {
    assert(stack.getMin() == min)
    println("stack.getMin() ${stack.getMin()} and min is $min")
    assert(stack.getMax() == max)
    println("stack.getMax() ${stack.getMax()} and max is $max")
    assert(stack.peek() == peek)
    println("stack.peek() ${stack.peek()} and peek is $peek")

}