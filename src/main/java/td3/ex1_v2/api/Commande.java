package td3.ex1_v2.api;

import java.util.HashMap;
import java.util.Map;

public class Commande implements PrePostVisitable, Visitable {
    private final String name;
    private final Map<String, Ligne> lignes;

    public Commande(String name) {
        this.name = name;
        this.lignes = new HashMap<>();
    }

    public void addLigne(Ligne ligne) {
        this.lignes.put(ligne.getName(), ligne);
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
        return "Commande [lignes=" + lignes + ", name=" + name + "]";
    }

}
