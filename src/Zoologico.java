public class Zoologico {
    public static void main(String[] args) {
        Lobo lobo = new Lobo("Lobo Cinzento", 6, true, "Auuuuu", "Floresta");
        lobo.emitirSom();
        lobo.latir();
        lobo.uivar();

        Gato gato = new Gato("Mimi", 3, true, true, "Persa");
        gato.emitirSom();
        gato.escalar();
        gato.miar();

        Papagaio papagaio = new Papagaio("Louro", 2, true, "Verde");
        papagaio.emitirSom();
        papagaio.voar();
        papagaio.falar();
    }
}
