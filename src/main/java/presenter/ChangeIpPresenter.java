package presenter;

import view.View;

import javax.swing.*;

public class ChangeIpPresenter extends Presenter<ChangeIpPresenter.Displayable>{
    public static final String NAME = "Change-IP";

    public ChangeIpPresenter(ChangeIpPresenter.Displayable view) {
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
        void reset();
    }

    @Override
    public void execute() {
        getView().getBackButton().addActionListener(e -> goTo(MenuPresenter.NAME));
    }
}
