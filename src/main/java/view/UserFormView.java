package view;

import components.LabeledTextField;
import presenter.UserFormPresenter;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class UserFormView implements UserFormPresenter.Displayable {
    public static final String NAME = "user-form-view";

    @Override
    public String getPath() {
        return NAME;
    }

    private JComboBox userType;
    //private JButton createUser;
    private JButton backButton;
    private JButton submitButton;
    private Map<String, LabeledTextField> fields;
    String[] userStrings = {"A","B","C"};

    public UserFormView() {
        fields = new HashMap<>();
    }

    @Override
    public Component getComponent() {

        JPanel panel = new JPanel();

        addFirstName(panel);
        addLastName(panel);
        addEmail(panel);
        addPassword(panel);
        addRole(panel);

        backButton = new JButton("Back");
        submitButton = new JButton("Submit");

        panel.add(backButton);
        panel.add(submitButton);

        panel.setSize(600, 900);
        return panel;
    }

    private void addFirstName(JPanel panel) {
        LabeledTextField firstName = new LabeledTextField("firstName");
        //fields.put(STORENAME, userName);
        panel.add(firstName);
    }

    private void addLastName(JPanel panel) {
        LabeledTextField lastName = new LabeledTextField("Lastname");
        //fields.put(ADDRESS, address);
        panel.add(lastName);
    }

    private void addEmail(JPanel panel) {
        LabeledTextField email = new LabeledTextField("Email");
        //fields.put(PHONE_NUMBER, phoneNumber);
        panel.add(email);
    }

    private void addPassword(JPanel panel) {
        LabeledTextField password = new LabeledTextField("Password");
        //fields.put(PHONE_NUMBER, phoneNumber);
        panel.add(password);
    }

    private void addRole(JPanel panel) {
        JLabel userTypeLabel = new JLabel("Type");
        panel.add(userTypeLabel);
        userType = new JComboBox(userStrings);
        userTypeLabel.setLabelFor(userType);
        panel.add(userType);
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