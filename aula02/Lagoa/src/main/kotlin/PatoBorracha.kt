class PatoBorracha(voar : VoarNoWay) : Pato(voar) {

    // polimorfismo 'engessando' o estilo de novo
    override fun mudarEstiloDeVoo(novoVoo: Voar) {
        println("não posso mudar estilo de voo")
    }
}