public class Ave extends Animal {
    private boolean podeVoar;

    public Ave(String nome, int idade, boolean podeVoar) {
        super(nome, idade);
        this.podeVoar = podeVoar;
    }

    public void voar() {
        if (podeVoar) {
            System.out.println("A ave está voando");
        } else {
            System.out.println("Esta ave não pode voar");
        }
    }

    public boolean isPodeVoar() {
        return podeVoar;
    }

    public void setPodeVoar(boolean podeVoar) {
        this.podeVoar = podeVoar;
    }
}