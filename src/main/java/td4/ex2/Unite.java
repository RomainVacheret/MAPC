package td4.ex2;

public class Unite {
    private final DeplacementStrategy deplacement;
    private final AttaqueStrategy attaque;

    public Unite(DeplacementStrategy deplacement, AttaqueStrategy attaque) {
        this.deplacement = deplacement;
        this.attaque = attaque;
    }

    public void seDeplacer() { this.deplacement.deplacer(); }
    public void attaquer() {this.attaque.attaque(); }

}
