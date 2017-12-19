package presenter;

import view.View;

import javax.swing.*;

public class DashboardPresenter extends Presenter<DashboardPresenter.Displayable> {

    public static final String NAME = "dashboard";

    public interface Displayable extends View {
        JButton getConnexion();
        JButton getIpButton();
    }

    public DashboardPresenter(Displayable view) { super(view); }

    @Override
    public void execute(){
        getView().getConnexion().addActionListener(e -> goTo(MenuPresenter.NAME));
        getView().getIpButton().addActionListener(e -> goTo(ChangeIpPresenter.NAME));
    }

    @Override
    public String getPath() {
        return NAME;
    }

}