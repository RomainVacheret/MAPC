package td4.ex2;

public class Rouler implements DeplacementStrategy {
    private static DeplacementStrategy instance = new Rouler();

    private Rouler() {}

    public static DeplacementStrategy getInstance() {
        if(instance == null) {
            instance = new Rouler();
        }
        return instance;
    }

    @Override
    public void deplacer(Unite unite) {
        System.out.println("Avance de 1 (Rouler)");
        unite.deplacement(1);
    }
    
}
