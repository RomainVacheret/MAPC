package td4.ex2;

public class Unite {
    private final DeplacementStrategy deplacement;
    private final AttaqueStrategy attaque;
    private int vie;

    public Unite(DeplacementStrategy deplacement, AttaqueStrategy attaque, int vie) {
        this.deplacement = deplacement;
        this.attaque = attaque;
        this.vie = vie;
    }

    public void seDeplacer() { this.deplacement.deplacer(); }
    public void attaquer(Unite unite) {this.attaque.attaque(unite); }
    public void seDeplacerEtAttaquer(Unite unite) {
        System.out.println("-- Deplacement et attaque --");
        this.deplacement.deplacer();
        this.attaque.attaque(unite);
    }

    public void estAttaque(int degats) { this. vie -= degats; }
    public boolean estVivant() { return this.vie > 0; }

}
