package td3.ex1.api;

import java.util.HashMap;
import java.util.Map;

public class Client implements PrePostVisitable, Visitable {
    public final String name;
    private final Map<String, Commande> commandes;

    public Client(String name) {
        this.name = name;
        this.commandes = new HashMap<>();
    }

    public void addCommande(Commande commande) {
        this.commandes.put(commande.name, commande);
    }

    public void addLigne(String commande, Ligne ligne) {
        this.commandes.get(commande).addLigne(ligne);
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub

    }
    
}
