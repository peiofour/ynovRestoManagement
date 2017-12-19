package presenter;

import listgestion.Stores;
import restaurant.Store;
import usersclass.Gerant;
import view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static utils.Constants.*;

public class StoreFormPresenter extends Presenter<StoreFormPresenter.Displayable> {

    public static final String NAME = "store-form";

    public StoreFormPresenter(Displayable view) {

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
        getView().getSubmitButton().addActionListener(e -> goTo(StoreListPresenter.NAME));
        getView().getBackButton().addActionListener(e -> goTo(MenuPresenter.NAME));
        getView().getSubmitButton().addActionListener(this::createStore);

    }

    private void createStore(ActionEvent actionEvent) {
        try {
            Store store = new Store(getView().getValueForField(STORENAME),
                                    getView().getValueForField(ADDRESS),
                    new Gerant(1,"rachid", "test","efefd@gmail.com","texsst"),
                                    Integer.valueOf(getView().getValueForField(PHONE_NUMBER)));

            Stores.getInstance().addStore(store);
            getView().reset();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
