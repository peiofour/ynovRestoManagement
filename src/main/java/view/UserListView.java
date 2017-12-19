package view;

import presenter.UserListPresenter;

import javax.swing.*;
import java.awt.*;

public class UserListView implements UserListPresenter.Displayable {

    private JTable userTable;
    private JButton createUser;
    private JButton editUser;
    private JButton backButton;


    @Override
    public Component getComponent() {
        JPanel panel = new JPanel();
        panel.setLayout( new BorderLayout() );
        panel.add(new JScrollPane(userTable),BorderLayout.CENTER);
        userTable = new JTable();


        JPanel subPanel = new JPanel();

        createUser = new JButton("Create a new User");
        editUser = new JButton("Edit a User");
        backButton = new JButton("Back to Menu");

        subPanel.add(createUser);
        subPanel.add(editUser);
        subPanel.add(backButton);

        panel.add(subPanel, BorderLayout.PAGE_END);

        return panel;
    }

    @Override
    public JTable getUserTable() {
        return userTable;
    }

    @Override
    public JButton getCreateUser() { return createUser; }

    @Override
    public JButton getBackButton() {
        return backButton;
    }

    @Override
    public JButton getEditUser(){ return editUser; }

}

