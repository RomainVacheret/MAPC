package td4.ex1.v1;

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
        Integer caisse = d.getCaisse(); 
        System.out.println(String.format("Encaisse %d.", monnaie));
        caisse += monnaie;
        if(caisse >= 10){
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
}
