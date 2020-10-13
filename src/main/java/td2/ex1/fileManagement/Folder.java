package td2.ex1.fileManagement;

import java.util.List;
import java.lang.StringBuilder;
import java.lang.Integer;

class Folder extends Composant {
    Folder(String name, String owner) {
        super(name, owner);
    }

    public addChilden(Composant child) {
        this.children.add(child);
    }

    public List<Composant> getChildren() {
        return this.children;
    }

    public void removeChild(Composant child) {

    }

    public int getSize() {
        return this.content.map(Content::getSize).reduce(Integer::sum);
    }

    public void removeChildren() {
        this.children.clear();
    }

    @Override
    public String getContent() {
        StringBuilder sb = new StringBuilder("File content:\n");
        sb.append(super.getContent());
        return sb.toString();
    }
}