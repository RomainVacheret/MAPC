package td3.ex1.api;

import java.util.ArrayList;
import java.util.Collection;

public class GroupeClient implements PrePostVisitable, Visitable {
    private final String name;
    public final Collection<Client> clients;

    public GroupeClient(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void addCommande(String client, Commande commande) {
        for(int i = 0; i < ((ArrayList) this.clients).size(); i++) {
            Client c = (Client) ((ArrayList) this.clients).get(i);
            if(c.getName().equals(client)) {
                c.addCommande(commande);
            }
        }
    }

    public void addLigne(String client, String commande, Ligne ligne) {
        for(int i = 0; i < ((ArrayList) this.clients).size(); i++) {
            Client c = (Client) ((ArrayList) this.clients).get(i);
            if(c.getName().equals(client)) {
                c.addLigne(commande, ligne);
            }
        }
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub

    }

    public String getName() {
        return name;
    }
    
}
