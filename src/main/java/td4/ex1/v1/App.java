package td4.ex1.v1;

public class App {
    public static void main(String[] args) {
        Distributeur d = new Distributeur();

        d.commandeCafe();
        d.donne(5);
        d.commandeCafe();
        d.donne(30);
        d.commandeCafe();
        d.donne(1);
        d.commandeCafe();
    }
}
