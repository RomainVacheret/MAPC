package td3.ex1_v2.api;

public class PrintRapportCommandes implements Visitor {

    @Override
    public void visit(GroupeClient groupeClient) {
        for(Client c: groupeClient.getClients().values()){
            c.accept(this);
        }
    }

    @Override
    public void visit(Client client) {
        System.out.println(String.format("Le client %s doit %d euros.", client.getName(), client.getDette()));
    }

    @Override
    public void visit(Commande commande) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visit(Ligne ligne) {
        // TODO Auto-generated method stub

    }
    
}
