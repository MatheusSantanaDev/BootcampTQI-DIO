fun main() {
    println("Enter with roman numeral: ")
    val numeroRomano: String? = readLine()

    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var resultado = 0

    for (i in numeroRomano!!.indices) {
        val atual = numerosRomanos.getValue(numeroRomano[i])
        val proximo = when (i + 1) {
            numeroRomano.length -> 0
            else -> numerosRomanos.getValue(numeroRomano[i + 1])
        }

        if (atual >= proximo) {
            resultado += atual
        } else {
            resultado -= atual
        }
    }

    print(resultado)
}
