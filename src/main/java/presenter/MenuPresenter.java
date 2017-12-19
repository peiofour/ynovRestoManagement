package presenter;

import view.View;

import javax.swing.*;

public class MenuPresenter extends Presenter<MenuPresenter.Displayable>{

    public static final String NAME = "menu-presenter";

    public MenuPresenter(Displayable view) {
        super(view);
    }

    @Override
    public String getPath() {
        return NAME;
    }

    public interface Displayable extends View {
        //JButton getSubmitButton();
        JButton getListUsersButton();
        JButton getListProductsButton();
        JButton getListStoresButton();
        JButton getModifyProfilButton();
        JButton getAddUser();
        JButton getBackButton();
    }

    @Override
    public void execute() {
        getView().getListUsersButton().addActionListener(e -> goTo(UserListPresenter.NAME));
        getView().getListProductsButton().addActionListener(e -> goTo(ProductListPresenter.NAME));
        getView().getListStoresButton().addActionListener(e -> goTo(StoreListPresenter.NAME));
        getView().getModifyProfilButton().addActionListener(e -> goTo(StoreListPresenter.NAME));
        getView().getAddUser().addActionListener(e -> goTo(UserFormPresenter.NAME));
        getView().getBackButton().addActionListener(e -> goTo(DashboardPresenter.NAME));

    }
}