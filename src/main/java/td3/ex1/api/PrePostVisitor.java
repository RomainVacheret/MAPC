package td3.ex1.api;

public interface PrePostVisitor extends AbstractVisitor{  
    void preVisit(GroupeClient groupClient);
    void preVisit(Client client);
    void preVisit(Commande commande);
    void preVisit(Ligne ligne);
    void postVisit(GroupeClient groupClient);
    void postVisit(Client client);
    void postVisit(Commande commande);
    void postVisit(Ligne ligne);
}