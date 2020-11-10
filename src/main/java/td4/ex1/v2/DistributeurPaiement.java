package td4.ex1.v2;

public class DistributeurPaiement implements DistributeurState {

    private static String INFO = "Action impossible";
    private static DistributeurState instance;

    private DistributeurPaiement() {
    }

    public static DistributeurState getInstance() {
        if (instance == null) {
            instance = new DistributeurPaiement();
        }
        return instance;
    }

    @Override
    public void donne(Distributeur d, int monnaie) {
        System.out.println(String.format("Encaisse %d.", monnaie));
        d.ajoutCaisse(monnaie);
        if (d.getCaisse() >= 10) {
            d.setState(DistributeurSelection.getInstance());
        } else {
            d.setState(DistributeurPaiement.getInstance());
        }
    }

    @Override
    public void commandeCafe(Distributeur d) {
        System.out.println(INFO);
    }

    @Override
    public void commandeThe(Distributeur d) {
        System.out.println(INFO);
    }

    @Override
    public int remboursement(Distributeur d) {
        int caisse = d.getCaisse();
        d.razCaisse();
        return caisse;
    }

    
}
