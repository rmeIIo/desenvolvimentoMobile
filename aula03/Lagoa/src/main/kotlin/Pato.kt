import Voo.Voar
open class Pato(var voar: Voar) {
    fun voarNaoSeiComo() {
        this.voar.executaVoo()
    }

    fun mudarEstiloDeVoo(novoVoo: Voar) {
        this.voar = novoVoo
    }

    fun fazerQuack() {
        println("Quack!")
    }
}