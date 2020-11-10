package td4.ex1.v2;

public class DistributeurFin implements DistributeurState {
    
    private static DistributeurState instance;
    private static String INFO = "Action impossible.";

    public static DistributeurState getInstance() {
        if (instance == null) {
            instance = new DistributeurSelection();
        }
        return instance;
    }

    @Override
    public void commandeCafe(Distributeur d) { System.out.println(INFO); }

    @Override
    public void commandeThe(Distributeur d) { System.out.println(INFO); }

    @Override
    public void donne(Distributeur d, int monnaie) { System.out.println(INFO); }

    @Override
    public int remboursement(Distributeur d) {
        int caisse = d.getCaisse();
        d.razCaisse();
        d.setState(DistributeurPaiement.getInstance());
        return caisse;
    }
}

