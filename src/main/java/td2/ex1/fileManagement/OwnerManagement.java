package td2.ex1.fileManagement;

import java.util.List;
import java.lang.String;

class OwnerManagement {
    private static final List<String> ownerNames = new ArrayList<>();

    public static addOwner(String name) {
        return isOwnerNameAvailable(name) ? ownerNames.add(name) : false;
    }

    private static boolean isOwnerNameAvailable(String name){
        return OwnerManagement.ownerNames.contains(name);
    }
}