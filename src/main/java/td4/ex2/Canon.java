package td4.ex2;

public class Canon implements AttaqueStrategy {
    private static AttaqueStrategy instance = new Canon();

    private Canon() {}

    public static AttaqueStrategy getInstance() {
        if(instance == null) {
            instance = new Canon();
        }
        return instance;
    }

    @Override
    public void attaque() {
        System.out.println("Attaque 3 (Canon)");
    }
    
}
