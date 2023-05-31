data class Pais(var habitantes: Double, val taxaCrescimento: Double) {
    fun crescerPopulacaoAnual() {
        val crescimento = habitantes * (taxaCrescimento / 100)
        habitantes += crescimento
    }
}

fun main() {
    println("Enter with population number of A country:")
    val habitantesPaisA = readLine()!!.toDouble()
    println("Enter with population number of B country:")
    val habitantesPaisB = readLine()!!.toDouble()
    val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)

    var quantidadeAnos = 0
    while (paisA.habitantes < paisB.habitantes) {
        paisA.crescerPopulacaoAnual()
        paisB.crescerPopulacaoAnual()
        quantidadeAnos++
    }

    println("$quantidadeAnos anos")
}

