package td3.ex1_v2.api;

import java.util.HashMap;
import java.util.Map;

public class Client implements PrePostVisitable, Visitable {
    private final String name;
    private final Map<String, Commande> commandes;

    public Client(String name) {
        this.name = name;
        this.commandes = new HashMap<>();
    }

    public void addLigne(String commande, Ligne ligne) {
        this.commandes.get(commande).addLigne(ligne);
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
        return "Client [commandes=" + commandes + ", name=" + name + "]";
    }

}
