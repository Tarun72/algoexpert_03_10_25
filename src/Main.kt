import sorting.InsertionSort
import sorting.SelectionSort

//import linkedlist.ProgramTest

/**
 * https://github.com/Tarun72/algoexpert_03_10_25.git
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

//    ProgramTest().TestCase1()
    var array = mutableListOf(8, 5, 2, 9, 5, 6, 3)
    print("$array")
//   val result =  InsertionSort().insertionSort(array)
    val result = SelectionSort().selectionSort(array)
    println()
    println("result: $result")
}