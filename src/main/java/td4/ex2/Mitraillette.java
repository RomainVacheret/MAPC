package td4.ex2;


public class Mitraillette implements AttaqueStrategy {

    private static AttaqueStrategy instance = new Mitraillette();

    private Mitraillette() {}

    public static AttaqueStrategy getInstance() {
        if(instance == null) {
            instance = new Mitraillette();
        }
        return instance;
    }

    @Override
    public void attaque(Unite unite) {
        System.out.println("Attaque de 2 (Mitraillette)");
        unite.estAttaque(2);
    }
    
}
