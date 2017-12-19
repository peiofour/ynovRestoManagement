package presenter;

import utils.PasswordManager;
import utils.RequestHandler;
import view.View;

import javax.swing.*;

import static utils.Constants.*;

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
        String getPath();
        JButton getBackButton();
        JButton getSubmitButton();
        String getValueForField(String field);
        JComboBox getUserType();
        void reset();
    }

    @Override
    public void execute() {
        getView().getBackButton().addActionListener(e -> goTo(MenuPresenter.NAME));
        getView().getSubmitButton().addActionListener(e -> goTo(UserListPresenter.NAME));
        getView().getSubmitButton().addActionListener(e -> RequestHandler.getInstance().addUser(
                //password
                PasswordManager.hashPassword(getView().getValueForField(PASSWORD)),
                //firstname
                getView().getValueForField(FIRSTNAME),
                //lastname
                getView().getValueForField(LASTNAME),
                //role
                getView().getUserType().getSelectedIndex() + 1,
                //mail
                getView().getValueForField(EMAIL)
        ));
    }
}
