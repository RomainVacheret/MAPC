package td3.ex1.api;

import java.util.HashMap;
import java.util.Map;

public class Commande implements PrePostVisitable, Visitable {
    public final String name;
    private final Map<String, Ligne> lignes;

    public Commande(String name) {
        this.name = name;
        this.lignes = new HashMap<>();
    }

    public void addLigne(Ligne ligne) {
        this.lignes.put(ligne.name, ligne);
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
