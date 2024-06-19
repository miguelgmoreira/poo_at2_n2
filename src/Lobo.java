public class Lobo extends Canino {
    private String habitat;

    public Lobo(String nome, int idade, boolean temPelos, String tipoDeLatido, String habitat) {
        super(nome, idade, temPelos, tipoDeLatido);
        this.habitat = habitat;
    }

    public void uivar() {
        System.out.println("O lobo está uivando.");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
