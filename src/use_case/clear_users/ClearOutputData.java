package use_case.clear_users;

// TODO Complete me

import java.util.List;

public class ClearOutputData {
    private final List<String> usersCleared;
    public ClearOutputData(List<String> usersCleared) {
        this.usersCleared = usersCleared;
    }

    public List<String>getUsersCleared() {
        return usersCleared;
    }

}
