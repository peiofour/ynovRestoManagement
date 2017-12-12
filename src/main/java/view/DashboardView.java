package view;

import presenter.DashboardPresenter;

import javax.swing.*;
import java.awt.*;


public class DashboardView implements DashboardPresenter.Displayable {

        private JButton loginButton;
        private JTextField mailText;
        private JLabel labelMail;
        private JLabel labelPassword;
        private JTextField passwordText;

        public DashboardView() {
            loginButton = new JButton("Login");
            mailText = new JTextField();
            mailText.setColumns(10);
            passwordText = new JTextField();
            passwordText.setColumns(10);
            labelMail = new JLabel("Adresse mail");
            labelPassword = new JLabel("Password");
        }


        public Component getComponent() {
            DefaultButtonModel model = new DefaultButtonModel();
            Box verticalBox = Box.createVerticalBox();
            verticalBox.add(Box.createVerticalGlue());
            verticalBox.add(labelMail);
            verticalBox.add(mailText);
            verticalBox.add(labelPassword);
            verticalBox.add(passwordText);
            verticalBox.add(loginButton);
            JPanel panel = new JPanel(new GridBagLayout());
            panel.add(verticalBox);
            return panel;
        }

    @Override
    public JButton getDisplayEmployeeListButton() {
        return null;
    }

    public JButton getAddEmployeeButton() {
            return loginButton;
        }
}
