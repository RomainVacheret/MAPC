package td4.ex1.v2;

public interface DistributeurState {
    void donne(Distributeur d, int monnaie);
    void commandeCafe(Distributeur d);
    void commandeThe(Distributeur d);
    int remboursement(Distributeur d);
}