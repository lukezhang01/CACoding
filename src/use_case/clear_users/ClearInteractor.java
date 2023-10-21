package use_case.clear_users;

// TODO Complete me

import entity.User;
import entity.UserFactory;
import use_case.login.LoginInputData;
import use_case.login.LoginOutputData;
import use_case.signup.SignupOutputBoundary;
import use_case.signup.SignupUserDataAccessInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface clearDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface,
                            ClearOutputBoundary clearOutputBoundary) {
        this.clearDataAccessObject = clearDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }
    @Override
    public void execute() {
        clearDataAccessObject.clear();
        List<String> clearedUsers = clearDataAccessObject.getClearedUsers();
        ClearOutputData clearOutputData = new ClearOutputData(clearedUsers);
        clearPresenter.prepareSuccessView(clearOutputData);
    }

}
