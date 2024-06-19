public class Gato extends Felino {
    private String raca;

    public Gato(String nome, int idade, boolean temPelos, boolean gostaDeEscalar, String raca) {
        super(nome, idade, temPelos, gostaDeEscalar);
        this.raca = raca;
    }

    public void miar() {
        System.out.println("O gato está miando.");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
