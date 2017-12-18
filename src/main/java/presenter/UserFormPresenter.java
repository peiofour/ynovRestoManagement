package presenter;

import view.View;

import javax.swing.*;

public class UserFormPresenter extends Presenter<UserFormPresenter.Displayable>{
    public static final String NAME = "user-form";

    public UserFormPresenter(UserFormPresenter.Displayable view) {
        super(view);
    }

    @Override
    public String getPath() {
        return NAME;
    }

    public interface Displayable extends View {
        JButton getBackButton();
        JButton getSubmitButton();
        void reset();
    }

    @Override
    public void execute() {
        getView().getBackButton().addActionListener(e -> goTo(DashboardPresenter.NAME));
    }
}
