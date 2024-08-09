fun main() {
    val red = "\u001B[31m"
    val green = "\u001B[32m"
    val yellow = "\u001B[33m"
    val reset = "\u001B[0m"

    println("${red}CALCULADORA DE JUROS COMPOSTOS")
    println("------------------------------${reset}")

    print("${yellow}Informe o valor inicial do investimento: ${green}R$")
    val valorInicial = readLine()?.toDoubleOrNull() ?: 0.0

    print("${yellow}Informe a taxa de juros mensal (em %):${reset} ")
    val taxaJuros = readLine()?.toDoubleOrNull() ?: 0.0

    print("${yellow}Informe o número de meses:${reset} ")
    val numeroMeses = readLine()?.toIntOrNull() ?: 0

    val montanteFinal = valorInicial * Math.pow(1 + (taxaJuros / 100), numeroMeses.toDouble())

    println("O valor final do investimento será: ${green}R$ %.2f".format(montanteFinal))
}