package td4.ex2;

public class LanceFlamme implements AttaqueStrategy {

    private static AttaqueStrategy instance = new LanceFlamme();

    private LanceFlamme() {}

    public static AttaqueStrategy getInstance() {
        if(instance == null) {
            instance = new LanceFlamme();
        }
        return instance;
    }

    @Override
    public void attaque() {
        System.out.println("Attaque 1 (Lance flamme)");
    }
    
}
