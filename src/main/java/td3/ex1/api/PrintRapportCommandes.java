package td3.ex1.api;

public class PrintRapportCommandes implements Visitor{

    @Override
    public void visit(GroupeClient groupClient) {
        System.out.println(String.format("Visite du groupe de clients %s", groupClient.getName()));
    }

    @Override
    public void visit(Client client) {
        System.out.println(String.format("Visite du client %s", client.getName()));
    }

    @Override
    public void visit(Commande commande) {
        System.out.println(String.format("Visite de la commande %s", commande.getName()));

    }

    @Override
    public void visit(Ligne ligne) {
        System.out.println(String.format("Visite de la ligne %s", ligne.getName()));
    }
    
}
