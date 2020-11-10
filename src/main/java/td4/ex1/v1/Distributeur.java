package td4.ex1.v1;

public class Distributeur {
    
    private Integer caisse = 0;
    private DistributeurState state;

    public Distributeur() { this.state = DistributeurPaiement.getInstance(); }


    void setState(DistributeurState state) { this.state = state; }

    int getCaisse() { return this.caisse; }
    void ajoutCaisse(int val) { this.caisse += val; }
    void razCaisse() { this.caisse = 0; }

    public void donne(int monnaie) { this.state.donne(this, monnaie); }
    public void commandeCafe() { this.state.commandeCafe(this); }
    public void commandeThe() { this.state.commandeThe(this); }
}
