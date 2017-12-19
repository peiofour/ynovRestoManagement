package presenter;

import utils.ConnectionHandler;
import view.View;

import javax.swing.*;

import static utils.Constants.*;

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
        String getValueForField(String field);
        void reset();
    }

    @Override
    public void execute() {

        getView().getBackButton().addActionListener(e -> goTo(DashboardPresenter.NAME));
        getView().getSubmitButton().addActionListener
                (e -> ConnectionHandler.getInstance().setServerInfos(
                    getView().getValueForField(BDD_IP),
                    getView().getValueForField(BDD_PORT),
                    getView().getValueForField(BDD_NAME),
                    getView().getValueForField(BDD_USERNAME),
                    getView().getValueForField(BDD_MDP))
                );
    }
}
