package td4.ex2;

public class App {
    public static void main(String[] args) {
        DeplacementStrategy rouler = Rouler.getInstance();
        DeplacementStrategy courir = Courir.getInstance();
        DeplacementStrategy voler = Voler.getInstance();

        AttaqueStrategy mitraillette = Mitraillette.getInstance();
        AttaqueStrategy lanceFlamme = LanceFlamme.getInstance();
        AttaqueStrategy canon = Canon.getInstance();
        AttaqueStrategy missile = Missile.getInstance();

        Unite soldat = new Unite(courir, mitraillette, 2);
        Unite avion = new Unite(voler, missile, 4);
        Unite char_ = new Unite(rouler, canon, 3);
        Unite charModifie = new Unite(rouler, lanceFlamme, 3);
        
        soldat.seDeplacerEtAttaquer(char_);
        avion.seDeplacerEtAttaquer(charModifie);
        char_.seDeplacerEtAttaquer(avion);
        charModifie.seDeplacerEtAttaquer(char_);

        System.out.println(soldat.estVivant());
        System.out.println(avion.estVivant());
        System.out.println(char_.estVivant());
        System.out.println(charModifie.estVivant());
    }
}
