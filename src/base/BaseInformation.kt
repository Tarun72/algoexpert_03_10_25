package base
/**
 * https://github.com/Tarun72/algoexpert_03_10_25.git
 */
abstract class BaseInformation {
 abstract val problemUrl: String
 abstract val problemDescription: String
 abstract val type: ProblemType
 abstract val programCategory: ProblemCategory
 abstract val problemNumber: Int
}


enum class ProblemType(value: Int) {
    Easy(0),
    Medium(2),
    Hard(3),
    SuperHard(4),
}
enum class ProblemCategory(value: Int) {
    Arrays(0),
    Binary_Search_Trees(1),
    Linked_Lists(2),

}