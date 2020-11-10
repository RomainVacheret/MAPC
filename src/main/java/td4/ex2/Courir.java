package td4.ex2;

public class Courir implements DeplacementStrategy {
    private static DeplacementStrategy instance = new Courir();

    private Courir() {}

    public static DeplacementStrategy getInstance() {
        if(instance == null) {
            instance = new Courir();
        }
        return instance;
    }

    @Override
    public void deplacer() {
        System.out.println("Avance de 2 (Courir)");
    }
    
}
