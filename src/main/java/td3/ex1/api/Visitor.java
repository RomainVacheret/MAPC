package td3.ex1.api;

public interface Visitor extends AbstractVisitor {
    void visit(GroupeClient groupClient);
    void visit(Client client);
    void visit(Commande commande);
    void visit(Ligne ligne);
}