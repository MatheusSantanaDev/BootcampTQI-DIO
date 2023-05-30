package  AverageTxt

import java.io.File

fun main() {
    val inputFile = File("input.txt")
    val outputFile = File("output.txt")

    val lines = inputFile.readLines()

    val results = mutableListOf<String>()

    for (line in lines) {
        val average = line.toDouble()

        val result = when {
            average < 5 -> "Reproved"
            average >= 5 && average < 7 -> "Retriavel"
            average >= 7 -> "Aproved"
            else -> "Average invalid"
        }

        results.add(result)

    }
    println(results)
    outputFile.writeText(results.joinToString("\n"))
}