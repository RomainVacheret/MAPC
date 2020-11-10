package td4.ex1.v1;

public class Distributeur {
    
    private Integer caisse = 0;
    private DistributeurState state;

    public Distributeur() { this.state = DistributeurPaiement.getInstance(); }

    int getCaisse() { return this.caisse; }

    void setState(DistributeurState state) { this.state = state; }

    public void donne(int monnaie) { this.state.donne(this, monnaie); }
    public void commandeCafe() { this.state.commandeCafe(this); }
    public void commandeThe() { this.state.commandeThe(this); }
}
