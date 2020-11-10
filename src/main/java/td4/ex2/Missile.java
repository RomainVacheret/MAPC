package td4.ex2;

public class Missile implements AttaqueStrategy {

    private static AttaqueStrategy instance = new Missile();

    private Missile() {}

    public static AttaqueStrategy getInstance() {
        if(instance == null) {
            instance = new Missile();
        }
        return instance;
    }

    @Override
    public void attaque(Unite unite) {
       System.out.println("Attaque 4 (Missible)");
       unite.estAttaque(4);
    }
    
}
