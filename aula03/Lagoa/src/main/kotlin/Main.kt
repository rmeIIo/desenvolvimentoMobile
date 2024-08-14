import Sons.Quack
import Sons.SomDePato
import Voo.VooComAsa
import Voo.VooComBalao

fun main() {
    val patoJuca = Pato(VooComAsa())
    patoJuca.voarNaoSeiComo()

    patoJuca.mudarEstiloDeVoo(VooComBalao())
    patoJuca.voarNaoSeiComo()

    val cacadorJason = Cacador(VooComBalao(), Quack())
    cacadorJason.executarVoo()
    cacadorJason.imitarPato()
}