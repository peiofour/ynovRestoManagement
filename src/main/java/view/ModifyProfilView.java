package view;

import components.LabeledTextField;
import presenter.ModifyProfilPresenter;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ModifyProfilView implements ModifyProfilPresenter.Displayable {

    public static final String NAME = "modify-profil-view";

    @Override
    public String getPath() {
        return NAME;
    }

    //private JButton createUser;
    private JButton backButton;
    private JButton submitButton;
    private Map<String, LabeledTextField> fields;

    public ModifyProfilView() {
        fields = new HashMap<>();
    }

    @Override
    public Component getComponent() {

        JPanel panel = new JPanel();

        addModifyFirstName(panel);
        addModifyLastName(panel);
        addModifyEmail(panel);
        addOldPassword(panel);
        addModifyPassword(panel);
        addVerifPassword(panel);

        backButton = new JButton("Back");
        submitButton = new JButton("Submit");

        panel.add(backButton);
        panel.add(submitButton);

        panel.setSize(600, 900);
        return panel;
    }

    private void addModifyFirstName(JPanel panel) {
        LabeledTextField firstName = new LabeledTextField("Nom");
        //fields.put(STORENAME, userName);
        panel.add(firstName);
    }

    private void addModifyLastName(JPanel panel) {
        LabeledTextField lastName = new LabeledTextField("Prénom");
        //fields.put(ADDRESS, address);
        panel.add(lastName);
    }

    private void addModifyEmail(JPanel panel) {
        LabeledTextField email = new LabeledTextField("Email");
        //fields.put(PHONE_NUMBER, phoneNumber);
        panel.add(email);
    }

    private void addOldPassword(JPanel panel) {
        LabeledTextField oldPassword = new LabeledTextField("Ancien mot de passe");
        //fields.put(PHONE_NUMBER, phoneNumber);
        panel.add(oldPassword);
    }

    private void addModifyPassword(JPanel panel) {
        LabeledTextField password = new LabeledTextField("Nouveau mot de passe");
        //fields.put(PHONE_NUMBER, phoneNumber);
        panel.add(password);
    }

    private void addVerifPassword (JPanel panel) {
        LabeledTextField verifPassword = new LabeledTextField("Confirmer mot de passe");
        //fields.put(PHONE_NUMBER, phoneNumber);
        panel.add(verifPassword);
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

