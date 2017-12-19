package view;

import components.LabeledTextField;
import presenter.ModifyProfilPresenter;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static utils.Constants.*;

public class ModifyProfilView implements ModifyProfilPresenter.Displayable {

    public static final String NAME = "modify-profil-view";

    @Override
    public String getPath() {
        return NAME;
    }

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
        LabeledTextField modifyFirstName = new LabeledTextField("Nom");
        fields.put(MODIFYFIRSTNAME, modifyFirstName);
        panel.add(modifyFirstName);
    }

    private void addModifyLastName(JPanel panel) {
        LabeledTextField modifyLastName = new LabeledTextField("Prénom");
        fields.put(MODIFYLASTNAME, modifyLastName);
        panel.add(modifyLastName);
    }

    private void addModifyEmail(JPanel panel) {
        LabeledTextField modifyEmail = new LabeledTextField("Email");
        fields.put(MODIFYEMAIL, modifyEmail);
        panel.add(modifyEmail);
    }

    private void addOldPassword(JPanel panel) {
        LabeledTextField oldPassword = new LabeledTextField("Ancien mot de passe");
        fields.put(OLDPASSWORD, oldPassword);
        panel.add(oldPassword);
    }

    private void addModifyPassword(JPanel panel) {
        LabeledTextField modifyPassword = new LabeledTextField("Nouveau mot de passe");
        fields.put(MODIFYPASSWORD, modifyPassword);
        panel.add(modifyPassword);
    }

    private void addVerifPassword (JPanel panel) {
        LabeledTextField verifPassword = new LabeledTextField("Confirmer mot de passe");
        fields.put(VERIFPASSWORD, verifPassword);
        panel.add(verifPassword);
    }

    @Override
    public JButton getBackButton() {
        return backButton;
    }

    @Override
    public JButton getSubmitButton() {
        return submitButton;
    }

    @Override
    public String getValueForField(String field) {
        return fields.get(field).getInputValue();
    }

    @Override
    public void reset() {
        fields.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .forEach(LabeledTextField::reset);
    }
}

