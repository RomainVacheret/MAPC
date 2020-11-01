package td3.ex1_v2.api;

public class XMLRapportCommandes implements PrePostVisitor {

    @Override
    public void postVisit(GroupeClient groupeClient) {
        System.out.println("</groupe>");
    }

    @Override
    public void postVisit(Client client) {
        System.out.println("</client>");
        
    }

    @Override
    public void postVisit(Commande commande) {
        System.out.println("</commande>");
    }

    @Override
    public void postVisit(Ligne ligne) {
        // TODO
    }

    @Override
    public void preVisit(GroupeClient groupeClient) {
        System.out.println("<groupe>");
        for(Client c: groupeClient.getClients().values()){
            c.accept((PrePostVisitor) this);
        }
        this.postVisit(groupeClient);
    }

    @Override
    public void preVisit(Client client) {
        System.out.println(String.format("<client name=\"%s\">", client.getName()));
        for(Commande c: client.getCommandes().values()){
            c.accept((PrePostVisitor) this);
        }
        this.postVisit(client);
    }

    @Override
    public void preVisit(Commande commande) {
        System.out.println(String.format("<commande name=\"%s\">", commande.getName()));
        for(Ligne l: commande.getLignes().values()){
            l.accept((PrePostVisitor) this);
        }
        this.postVisit(commande);
    }

    @Override
    public void preVisit(Ligne ligne) {
        System.out.println(String.format("<ligne name=\"%s\" sum=\"%s\"/>", ligne.getName(), ligne.getSum()));
    }
    
}
