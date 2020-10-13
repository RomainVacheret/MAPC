package td2.ex1.fileManagement;

import java.lang.StringBuilder;
import java.lang.String;

class File extends Composant {
    File(String name, String owner) {
        super(name, owner);
    }

    @Override
    public getSize() {
        return this.content.size();
    }

    @Override
    public String getContent() {
        StringBuilder sb = new StringBuilder("File content:\n");
        sb.append(super.getContent());
        return sb.toString();
    }
}