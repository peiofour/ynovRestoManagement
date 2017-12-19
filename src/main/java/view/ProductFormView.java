package view;

import components.LabeledTextField;
import presenter.ProductFormPresenter;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static utils.Constants.AMOUNT;
import static utils.Constants.PRODUCTNAME;
import static utils.Constants.PRODUCTPRICE;

public class ProductFormView implements ProductFormPresenter.Displayable {
    public static final String NAME = "product-form-view";

    @Override
    public String getPath() {
        return NAME;
    }

    private JButton backButton;
    private JButton submitButton;
    private Map<String, LabeledTextField> fields;


    public ProductFormView() {
        fields = new HashMap<>();
    }

    @Override
    public Component getComponent() {

        JPanel panel = new JPanel();

        addProductName(panel);
        addProductPrice(panel);
        addAmount(panel);

        backButton = new JButton("Back");
        submitButton = new JButton("Submit");

        panel.add(backButton);
        panel.add(submitButton);

        panel.setSize(600, 900);
        return panel;
    }

    private void addProductName(JPanel panel) {
        LabeledTextField productName = new LabeledTextField("Nom du Produit");
        fields.put(PRODUCTNAME, productName);
        panel.add(productName);
    }

    private void addProductPrice(JPanel panel) {
        LabeledTextField productPrice = new LabeledTextField("Prix");
        fields.put(PRODUCTPRICE, productPrice);
        panel.add(productPrice);
    }

    private void addAmount(JPanel panel) {
        LabeledTextField amount = new LabeledTextField("Quantité");
        fields.put(AMOUNT, amount);
        panel.add(amount);
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
