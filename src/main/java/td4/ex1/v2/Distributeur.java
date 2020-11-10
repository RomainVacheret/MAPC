package td4.ex1.v2;

public class Distributeur {
    
    private Integer caisse = 0;
    private DistributeurState state;

    public Distributeur() { this.state = DistributeurPaiement.getInstance(); }


    void setState(DistributeurState state) { this.state = state; }

    int getCaisse() { return this.caisse; }
    void ajoutCaisse(int valeur) {  this.caisse += valeur; }
    void razCaisse() { this.caisse = 0; }
    void vente() { this.caisse -= 10; }

    public void donne(int monnaie) { this.state.donne(this, monnaie); }
    public void commandeCafe() { this.state.commandeCafe(this); }
    public void commandeThe() { this.state.commandeThe(this); }
    public int remboursement() { return this.state.remboursement(this); }
}
