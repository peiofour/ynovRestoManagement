package presenter;

import utils.RequestHandler;
import view.View;

import javax.swing.*;

public class DashboardPresenter extends Presenter<DashboardPresenter.Displayable> {

    public static final String NAME = "dashboard";

    public interface Displayable extends View {
        JButton getConnexion();
        JButton getIpButton();
        JTextField getUserMail();
        JTextField getUserPassword();
    }

    public DashboardPresenter(Displayable view) { super(view); }

    @Override
    public void execute(){
        getView().getConnexion().addActionListener(e ->
                gotoMenuPresenter()
        );
        getView().getIpButton().addActionListener(e -> goTo(ChangeIpPresenter.NAME));
    }

    @Override
    public String getPath() {
        return NAME;
    }

    public void gotoMenuPresenter(){
        if(RequestHandler.getInstance().checkUserByMail(getView().getUserMail().getText(), getView().getUserPassword().getText())){

            goTo(MenuPresenter.NAME);
        }
        else{
        }


    }

}