package td4.ex2;

public class App {
    public static void main(String[] args) {
        DeplacementStrategy rouler = new Rouler();
        DeplacementStrategy courir = new Courir();
        DeplacementStrategy voler = new Voler();

        AttaqueStrategy mitraillette = new Mitraillette();
        AttaqueStrategy lanceFlamme = new LanceFlamme();
        AttaqueStrategy canon = new Canon();
        AttaqueStrategy missile = new Missible();

        Unite soldat = new Unite(courir, mitraillette);
        Unite avion = new Unite(voler, missile);
        Unite char_ = new Unite(rouler, canon);
        Unite charModifie = new Unite(rouler, lanceFlamme);
        
        soldat.seDeplacerEtAttaquer();
        avion.seDeplacerEtAttaquer();
        char_.seDeplacerEtAttaquer();
        charModifie.seDeplacerEtAttaquer();
    }
}
