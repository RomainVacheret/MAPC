package td4.ex2;

public class Voler implements DeplacementStrategy {
    private static DeplacementStrategy instance = new Voler();

    private Voler() {}

    public static DeplacementStrategy getInstance() {
        if(instance == null) {
            instance = new Voler();
        }
        return instance;
    }

    @Override
    public void deplacer() {
        System.out.println("Avancer de 3 (Voler)");
    }
    
}
