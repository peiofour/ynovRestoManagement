package presenter;

import ListGestion.Stores;
import view.View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class StoreListPresenter extends Presenter<StoreListPresenter.Displayable> {

    private final Stores store;

    public StoreListPresenter(Displayable view, Stores store) {
        super(view);
        this.store = store;
    }

    public interface Displayable extends View {
        JTable getStoreTable();
        JButton getCreateStore();
        JButton getBackButton();
        JButton getEditStore();
    }

    @Override
    public void execute() {
        DefaultTableModel storeModel = new DefaultTableModel(
                new String[]{"Nom", "Address", "Phone", "Gerant"},
                0
        );
        Stores.getInstance().stores.forEach(e -> {
            storeModel.addRow(new Object[] {
                    e.getName(),
                    e.getAddress(),
                    e.getPhoneNumber(),
                    e.getGerant().getFullName(),
            });
        });
        getView().getStoreTable().setModel(storeModel);
        getView().getBackButton().addActionListener(e -> goTo(MenuPresenter.NAME));
        getView().getCreateStore().addActionListener(e -> goTo(StoreFormPresenter.NAME));
        getView().getEditStore().addActionListener(e -> goTo(UserFormPresenter.NAME));

    }

    public static final String NAME = "store-list";

    @Override
    public String getPath() {
        return NAME;
    }
}

