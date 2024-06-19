public class Canino extends Mamifero {
    private String tipoDeLatido;

    public Canino(String nome, int idade, boolean temPelos, String tipoDeLatido) {
        super(nome, idade, temPelos);
        this.tipoDeLatido = tipoDeLatido;
    }

    public void latir() {
        System.out.println("O canino está latindo: " + tipoDeLatido);
    }

    public String getTipoDeLatido() {
        return tipoDeLatido;
    }

    public void setTipoDeLatido(String tipoDeLatido) {
        this.tipoDeLatido = tipoDeLatido;
    }
}