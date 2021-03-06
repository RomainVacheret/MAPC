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

    public String getName() {
        return this.name;
    }

    public Map<String, Ligne> getLignes() {
        return this.lignes;
    }

    public int getDette() {
        return this.lignes.values().stream().map(Ligne::getSum).reduce(0, Integer::sum);
    }

    @Override
    public String toString() {
        return "Commande [lignes=" + lignes + ", name=" + name + "]";
    }

}
