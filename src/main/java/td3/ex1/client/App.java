package td3.ex1.client;

import td3.ex1.api.AbstractVisitor;
import td3.ex1.api.Client;
import td3.ex1.api.Commande;
import td3.ex1.api.GroupeClient;
import td3.ex1.api.Ligne;
import td3.ex1.api.MonException;
import td3.ex1.api.PrePostVisitor;
import td3.ex1.api.PrintRapportCommandes;
import td3.ex1.api.Visitor;
import td3.ex1.api.XMLRapportCommandes;
public class App {   
    private final GroupeClient groupeClient;
    private AbstractVisitor visiteur;

    public App(String nomGroupe) {
    this.groupeClient = new GroupeClient(nomGroupe);
    }
    public App(String nomGroupe, AbstractVisitor v) {
    this(nomGroupe);
    this.visiteur = v;
    }
    public void setVisiteur(AbstractVisitor v) {
    this.visiteur = v;
    }
    public static void main(String[] args) throws MonException {
    AbstractVisitor xmlVisitor = new XMLRapportCommandes();
    AbstractVisitor printVisitor = new PrintRapportCommandes();
    //
    App m = new App("clients");
    //
    Client c1 = new Client("bob");
    Client c2 = new Client("joe");
    m.groupeClient.addClient(c1);
    m.groupeClient.addClient(c2);
    //
    Commande cde1 = new Commande("cde1");
    Commande cde2 = new Commande("cde2");
    Commande cde3 = new Commande("cde3");
    m.groupeClient.addCommande("bob",cde1);
    m.groupeClient.addCommande("bob", cde2);
    m.groupeClient.addCommande("joe", cde3);
    //
    Ligne l1 = new Ligne("l1",100);
    Ligne l2 = new Ligne("l2",200);
    Ligne l3 = new Ligne("l3",400);
    Ligne l4 = new Ligne("l4",800);
    m.groupeClient.addLigne("bob", "cde1", l1);
    m.groupeClient.addLigne("bob", "cde1", l2);
    m.groupeClient.addLigne("bob", "cde2", l3);
    m.groupeClient.addLigne("joe", "cde3", l4);
    //
    m.setVisiteur(printVisitor);
    m.groupeClient.accept((Visitor)m.visiteur);
    //
    m.setVisiteur(xmlVisitor);
    m.groupeClient.accept((PrePostVisitor)m.visiteur);
    }
}
