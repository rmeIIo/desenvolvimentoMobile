fun main() {
    println("CALCULADORA DE JUROS COMPOSTOS")
    println("------------------------------")

    print("Informe o valor inicial do investimento: R$")
    val valorInicial = readLine()?.toDoubleOrNull() ?: 0.0

    print("Informe a taxa de juros mensal (em %): ")
    val taxaJuros = readLine()?.toDoubleOrNull() ?: 0.0

    print("Informe o número de meses: ")
    val numeroMeses = readLine()?.toIntOrNull() ?: 0

    val montanteFinal = valorInicial * Math.pow(1 + (taxaJuros / 100), numeroMeses.toDouble())

    println("O valor final do investimento será: R$ %.2f".format(montanteFinal))
}