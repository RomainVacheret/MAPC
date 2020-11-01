package td3.ex1_v2.api;

import java.util.HashMap;
import java.util.Map;

public class GroupeClient implements PrePostVisitable, Visitable {
    private final String name;
    private final Map<String, Client> clients;

    public GroupeClient(String name) {
        this.name = name;
        this.clients = new HashMap<>();
    }

    public void addClient(Client client) {
        this.clients.put(client.getName(), client);
    }

    public void addCommande(String client, Commande commande) {
        this.clients.get(client).addCommande(commande);
    }

    public void addLigne(String client, String commande, Ligne ligne) {
        this.clients.get(client).addLigne(commande, ligne);
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "GroupeClient [clients=" + clients + ", name=" + name + "]";
    }
}
