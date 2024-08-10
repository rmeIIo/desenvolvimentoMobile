fun main() {
    val patoJuca = Pato(VooComAsa())

    patoJuca.fazerQuack()
    patoJuca.boiar()
    patoJuca.voarDeFato()
    println("Achei um balão!")
    patoJuca.mudarEstiloDeVoo(VooComBalao())
    patoJuca.voarDeFato()

    println("Pato Donald fará suas ações")
    val patoDonald = PatoBrabo(VooComAsa())
    patoDonald.bicar()
    patoDonald.boiar()
    patoDonald.fazerQuack()
    patoDonald.voarDeFato()
}