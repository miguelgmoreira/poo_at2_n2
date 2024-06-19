public class Papagaio extends Ave {
    private String corDasPenas;

    public Papagaio(String nome, int idade, boolean podeVoar, String corDasPenas) {
        super(nome, idade, podeVoar);
        this.corDasPenas = corDasPenas;
    }

    public void falar() {
        System.out.println("O papagaio está falando.");
    }

    public String getCorDasPenas() {
        return corDasPenas;
    }

    public void setCorDasPenas(String corDasPenas) {
        this.corDasPenas = corDasPenas;
    }
}