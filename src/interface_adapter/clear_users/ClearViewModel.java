package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;
import interface_adapter.login.LoginState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    public static final String CLEAR_BUTTON_LABEL = "Clear";

    private ClearState state = new ClearState();

    public ClearViewModel() {
        super("clear");
    }

    public void setState(ClearState state) {
        this.state = state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    // This is what the Signup Presenter will call to let the ViewModel know
    // to alert the View
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() {
        return state;
    }
}
