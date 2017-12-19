package view;

import presenter.DashboardPresenter;

import javax.swing.*;
import java.awt.*;


public class DashboardView implements DashboardPresenter.Displayable {

        private JButton loginButton;
        private JButton ipButton;
        private JTextField mailText;
        private JLabel labelMail;
        private JLabel labelPassword;
        private JTextField passwordText;

        public DashboardView() {
            loginButton = new JButton("Login");
            ipButton = new JButton("Changer IP");
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
            verticalBox.add(ipButton);
            JPanel panel = new JPanel(new GridBagLayout());
            panel.add(verticalBox);
            return panel;
        }

    public JButton getConnexion() {
       return loginButton;
    }

    public JButton getIpButton() {
        return ipButton;
    }

    @Override
    public JTextField getUserMail() {
        return mailText;
    }

    @Override
    public JTextField getUserPassword() {
        return passwordText;
    }
}
