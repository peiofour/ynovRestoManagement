package view;

import presenter.ProductListPresenter;

import javax.swing.*;
import java.awt.*;

public class ProductListView implements ProductListPresenter.Displayable {

    private JTable productTable;
    private JButton createProduct;
    private JButton editProduct;
    private JButton backButton;



    @Override
    public Component getComponent() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        productTable = new JTable();
        panel.add(new JScrollPane(productTable),BorderLayout.CENTER);


        JPanel subPanel = new JPanel();

        createProduct = new JButton("Create a new User");
        editProduct = new JButton("Edit a User");
        backButton = new JButton("Back to Menu");

        subPanel.add(createProduct);
        subPanel.add(editProduct);
        subPanel.add(backButton);

        panel.add(subPanel, BorderLayout.PAGE_END);

        return panel;
    }

    @Override
    public JTable getProductTable() {
        return productTable;
    }

    @Override
    public JButton getCreateProduct() { return createProduct; }

    @Override
    public JButton getBackButton() {
        return backButton;
    }

    @Override
    public JButton getEditProduct(){ return editProduct; }

}
