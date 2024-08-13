import Voo.VooComAsa
import Voo.VooComBalao

fun main() {
    val patoJuca = Pato(VooComAsa())
    patoJuca.voarNaoSeiComo()

    patoJuca.mudarEstiloDeVoo(VooComBalao())
    patoJuca.voarNaoSeiComo()
}