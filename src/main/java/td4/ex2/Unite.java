package td4.ex2;

public class Unite {
    private final DeplacementStrategy deplacement;
    private final AttaqueStrategy attaque;
    private int vie;
    private int position = 0;
    

    public Unite(DeplacementStrategy deplacement, AttaqueStrategy attaque, int vie) {
        this.deplacement = deplacement;
        this.attaque = attaque;
        this.vie = vie;
    }

    public void seDeplacer() { 
        if(estVivant()){
            this.deplacement.deplacer(this);    
        }
    }

    public void attaquer(Unite unite) {
        if(estVivant()) {
            this.attaque.attaque(unite);
        }
    }

    public void seDeplacerEtAttaquer(Unite unite) {
        if(estVivant()) {
            System.out.println("-- Deplacement et attaque --");
            this.deplacement.deplacer(this);
            this.attaque.attaque(unite);
        }
    }

    public void estAttaque(int degats) { this. vie -= degats; }
    public void deplacement(int cases) { this.position += cases; }
    public boolean estVivant() { return this.vie > 0; }

}
