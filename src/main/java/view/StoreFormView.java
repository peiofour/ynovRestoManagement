package view;

import components.LabeledTextField;
import presenter.StoreFormPresenter;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static utils.constants.*;

public class StoreFormView implements StoreFormPresenter.Displayable {

    public static final String NAME = "store-view";

    @Override
    public String getPath() {
        return NAME;
    }

    private JComboBox gerantType;
    private JButton createStore;
    private JButton backButton;
    private JButton submitButton;
    private Map<String, LabeledTextField> fields;
    String[] gerantStrings = {"A","B","C"};

    public StoreFormView() {
        fields = new HashMap<>();
    }


    @Override
    public Component getComponent() {
        JPanel panel = new JPanel();
        addStorename(panel);
        addAddress(panel);
        addPhonenumber(panel);
        addGerant(panel);
        backButton = new JButton("Back");
        submitButton = new JButton("Submit");
        panel.add(backButton);
        panel.add(submitButton);
        panel.setSize(600, 900);
        return panel;
    }

    private void addStorename(JPanel panel) {
        LabeledTextField storeName = new LabeledTextField("StoreName");
        fields.put(STORENAME, storeName);
        panel.add(storeName);
    }

    private void addAddress(JPanel panel) {
        LabeledTextField address = new LabeledTextField("Address");
        fields.put(ADDRESS, address);
        panel.add(address);
    }

    private void addPhonenumber(JPanel panel) {
        LabeledTextField phoneNumber = new LabeledTextField("PhoneNumber");
        fields.put(PHONE_NUMBER, phoneNumber);
        panel.add(phoneNumber);
    }

    private void addGerant(JPanel panel) {
        JLabel gerantTypeLabel = new JLabel("Type");
        panel.add(gerantTypeLabel);
        gerantType = new JComboBox(gerantStrings);
        gerantTypeLabel.setLabelFor(gerantType);
        panel.add(gerantType);
    }

    @Override
    public JButton getBackButton() {
        return backButton;
    }

    @Override
    public JButton getCreateStore() { return createStore; }

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