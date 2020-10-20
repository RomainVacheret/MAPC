package td3.ex1.api;

public class Ligne implements PrePostVisitable, Visitable {
    public final String name;
    private int sum = 0;

    public Ligne(String name) {
        this.name = name;
    }

    public Ligne(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub

    }
    
}
