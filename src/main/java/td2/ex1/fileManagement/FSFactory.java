package td2.ex1.fileManagement;

import Composant.ComposantType;

class FSFactory {
    private final static FSFactory instance = new FSFactory();

    public static getInstance() {
        return instance;
    }

    public Composant createComposant(ComposantType type, String name, String owner) {
        Composant rtr = null;
        switch(type) {
            case FILE:
                rtr = new File(name, owner);
                break;
            case FOLDER:
                rtr = new Folder(name, owner);
        }
        return rtr;
    }
}