package td4.ex1.v2;

public class DistributeurSelection implements DistributeurState {
    
    private static DistributeurState instance;

    public static DistributeurState getInstance() {
        if (instance == null) {
            instance = new DistributeurSelection();
        }
        return instance;
    }

    @Override
    public void commandeCafe(Distributeur d) {
        System.out.println("Donne du cafe.");
        d.vente();
        d.setState(DistributeurPaiement.getInstance());
    }

    @Override
    public void commandeThe(Distributeur d) {
        System.out.println("Donne du the.");
        d.vente();
        d.setState(DistributeurSelection.getInstance());
    }

    @Override
    public void donne(Distributeur d, int monnaie) {
        System.out.println("Action impossible");
    }

    @Override
    public int remboursement(Distributeur d) {
        int caisse = d.getCaisse();
        d.razCaisse();
        d.setState(DistributeurPaiement.getInstance());
        return caisse;
    }
}

