package interface_adapter.clear_users;
import java.util.*;
// TODO Complete me

public class ClearState {

    private List<String> names;

    public ClearState() {
        this.names = new ArrayList<String>();
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }
}
