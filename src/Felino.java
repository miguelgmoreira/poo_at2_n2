public class Felino extends Mamifero {
    private boolean gostaDeEscalar;

    public Felino(String nome, int idade, boolean temPelos, boolean gostaDeEscalar) {
        super(nome, idade, temPelos);
        this.gostaDeEscalar = gostaDeEscalar;
    }

    public void escalar() {
        if (gostaDeEscalar) {
            System.out.println("O felino está escalando");
        } else {
            System.out.println("Este felino não gosta de escalar");
        }
    }

    public boolean isGostaDeEscalar() {
        return gostaDeEscalar;
    }

    public void setGostaDeEscalar(boolean gostaDeEscalar) {
        this.gostaDeEscalar = gostaDeEscalar;
    }
}