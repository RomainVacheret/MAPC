package td4.ex1.v2;

public class App {
    public static void main(String[] args) {
        Distributeur d = new Distributeur();

        d.commandeCafe();
        d.donne(5);
        d.commandeCafe();
        d.donne(10);
        d.commandeCafe();
        System.out.println(d.remboursement());
        System.out.println(d.remboursement());
        
    }
}
