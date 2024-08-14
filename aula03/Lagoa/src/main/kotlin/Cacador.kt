import Sons.SomDePato
import Voo.Voar

class Cacador (var voar: Voar, var somDePato: SomDePato) {
    fun executarVoo() {
        this.voar.executaVoo()
    }

    fun imitarPato() {
        somDePato.fazerSomDePato()
    }

    fun mudarEstiloDeVoo(novoVoo: Voar) {
        voar = novoVoo
    }

    fun mudarSomDePato(novoSom: SomDePato) {
        somDePato = novoSom
    }
}