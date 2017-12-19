package view;

import components.LabeledTextField;
import presenter.ChangeIpPresenter;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ChangeIPView implements ChangeIpPresenter.Displayable {

    public static final String NAME = "change-ip-view";

    @Override
    public String getPath() {
        return NAME;
    }

    //private JButton createUser;
    private JButton backButton;
    private JButton submitButton;
    private Map<String, LabeledTextField> fields;

    public ChangeIPView() {
        fields = new HashMap<>();
    }

    @Override
    public Component getComponent() {

        JPanel panel = new JPanel();

        addHostName(panel);
        addPassword(panel);
        addIpDatabase(panel);
        addNameDatabase(panel);
        addPorts(panel);

        backButton = new JButton("Back");
        submitButton = new JButton("Submit");

        panel.add(backButton);
        panel.add(submitButton);

        panel.setSize(600, 900);
        return panel;
    }

    private void addHostName(JPanel panel) {
        LabeledTextField hostName = new LabeledTextField("Nom d'utilisateur");
        //fields.put(STORENAME, userName);
        panel.add(hostName);
    }


    private void addPassword(JPanel panel) {
        LabeledTextField password = new LabeledTextField("Mot de passe");
        //fields.put(PHONE_NUMBER, phoneNumber);
        panel.add(password);
    }

    private void addIpDatabase(JPanel panel) {
        LabeledTextField ipDatabase = new LabeledTextField("IP de la base de données");
        //fields.put(PHONE_NUMBER, phoneNumber);
        panel.add(ipDatabase);
    }

    private void addNameDatabase(JPanel panel) {
        LabeledTextField nameDatabase = new LabeledTextField("Nom de la base de données");
        //fields.put(PHONE_NUMBER, phoneNumber);
        panel.add(nameDatabase);
    }

    private void addPorts(JPanel panel) {
        LabeledTextField ports = new LabeledTextField("Ports");
        //fields.put(PHONE_NUMBER, phoneNumber);
        panel.add(ports);
    }



    @Override
    public JButton getBackButton() {
        return backButton;
    }

    /*@Override
    public JButton getCreateUser() { return createUser; }*/

    @Override
    public JButton getSubmitButton() {
        return submitButton;
    }

    /*@Override
    public String getValueForField(String field) {
        return fields.get(field).getInputValue();
    }*/

    @Override
    public void reset() {
        fields.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .forEach(LabeledTextField::reset);
    }
}

