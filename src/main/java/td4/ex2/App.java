package td4.ex2;

public class App {
    public static void main(String[] args) {
        DeplacementStrategy rouler = new Rouler();
        DeplacementStrategy courir = new Courir();
        DeplacementStrategy voler = new Voler();

        AttaqueStrategy mitraillette = Mitraillette.getInstance();
        AttaqueStrategy lanceFlamme = LanceFlamme.getInstance();
        AttaqueStrategy canon = Canon.getInstance();
        AttaqueStrategy missile = Missile.getInstance();

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
