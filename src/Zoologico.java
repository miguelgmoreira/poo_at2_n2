public class Zoologico {
    public static void main(String[] args) {
        Canino cachorro = new Canino("Bob", 5, true, "Au Au");
        cachorro.emitirSom();
        cachorro.latir();

        Felino gato = new Felino("Garfield", 3, true, true);
        gato.emitirSom();
        gato.escalar();

        Papagaio papagaio = new Papagaio("Louro", 2, true, "Verde");
        papagaio.emitirSom();
        papagaio.voar();
        papagaio.falar();
    }
}