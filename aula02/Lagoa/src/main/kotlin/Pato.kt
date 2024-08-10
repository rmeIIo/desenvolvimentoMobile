open class Pato(var voo: Voar) {
    fun voarDeFato() {
        this.voo.executaVoo()
    }

    fun mudarEstiloDeVoo(novoVoo : Voar) {
        this.voo = novoVoo
    }

    fun fazerQuack() {
        println("Quack!")
    }

    fun boiar() {
        println("Estou boiando!")
    }
}