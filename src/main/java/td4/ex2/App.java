package td4.ex2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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

        List<Unite> unites = List.of(soldat, avion, char_, charModifie);

        List<Unite> unitesVivantes = unites;
        int idx = new Random().nextInt(unites.size());
        System.out.println(idx);
        
        do {
            int autreIdx = new Random().nextInt(unitesVivantes.size());
            unitesVivantes.get(idx).attaquer(unitesVivantes.get(autreIdx));
            unitesVivantes = unites.stream().filter(Unite::estVivant).collect(Collectors.toList());
            idx = (idx + 1) % unitesVivantes.size();
        } while(unitesVivantes.size() != 1);
        
        // soldat.seDeplacerEtAttaquer(char_);
        // avion.seDeplacerEtAttaquer(charModifie);
        // char_.seDeplacerEtAttaquer(avion);
        // charModifie.seDeplacerEtAttaquer(char_);

        System.out.println(soldat.estVivant());
        System.out.println(avion.estVivant());
        System.out.println(char_.estVivant());
        System.out.println(charModifie.estVivant());

    }
}
