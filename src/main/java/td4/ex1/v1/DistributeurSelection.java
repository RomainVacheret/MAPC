package td4.ex1.v1;

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
        d.razCaisse();
        d.setState(DistributeurPaiement.getInstance());
    }

    @Override
    public void commandeThe(Distributeur d) {
        System.out.println("Donne du the.");
        d.razCaisse();
        d.setState(DistributeurSelection.getInstance());
    }

    @Override
    public void donne(Distributeur d, int monnaie) {
        System.out.println("Action impossible");
    }
}

