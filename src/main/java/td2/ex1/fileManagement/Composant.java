package td2.ex1.fileManagement;

abstract class Composant {
    enum ComposantType {
        FILE, FOLDER
    }

    protected final String name;
    protected final String owner;
    protected final List<String> content;

    Composant(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.content = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getContent() {
        StringBuilder sb = new StringBuilder();
        this.content.forEach(c -> sb.append(c).append(",\n"));
        return sb.toString();
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public abstract int getSize();

    public abstract void appendContent(String content);
}