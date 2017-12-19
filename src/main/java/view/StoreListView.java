package view;

import presenter.StoreListPresenter;

import javax.swing.*;
import java.awt.*;

public class StoreListView implements StoreListPresenter.Displayable {

    private JTable storeTable;
    private JButton createStore;
    private JButton editStore;
    private JButton backButton;


    @Override
    public Component getComponent() {
        JPanel panel = new JPanel();
        panel.setLayout( new BorderLayout() );
        panel.add(new JScrollPane(storeTable),BorderLayout.CENTER);
        storeTable = new JTable();


        JPanel subPanel = new JPanel();

        createStore = new JButton("Create a new Store");
        editStore = new JButton("Edit a Store");
        backButton = new JButton("Back to Menu");


        subPanel.add(createStore);
        subPanel.add(editStore);
        subPanel.add(backButton);

        panel.add(subPanel, BorderLayout.PAGE_END);

        return panel;
    }

    @Override
    public JTable getStoreTable() {
        return storeTable;
    }

    @Override
    public JButton getCreateStore() { return createStore; }

    @Override
    public JButton getBackButton() {
        return backButton;
    }

    @Override
    public JButton getEditStore(){ return editStore; }

}

