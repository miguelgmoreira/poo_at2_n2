public class Mamifero extends Animal {
    private boolean temPelos;

    public Mamifero(String nome, int idade, boolean temPelos) {
        super(nome, idade);
        this.temPelos = temPelos;
    }

    public void amamentar() {
        System.out.println("O mamífero está amamentando");
    }

    public boolean isTemPelos() {
        return temPelos;
    }

    public void setTemPelos(boolean temPelos) {
        this.temPelos = temPelos;
    }
}