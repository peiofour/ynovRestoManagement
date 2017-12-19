package presenter;

import productclass.Product;
import view.View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ProductListPresenter extends Presenter<ProductListPresenter.Displayable> {

    public ProductListPresenter(ProductListPresenter.Displayable view) {
        super(view);
    }

    public interface Displayable extends View {
        JTable getProductTable();
        JButton getCreateProduct();
        JButton getBackButton();
        JButton getEditProduct();
    }

    @Override
    public void execute() {
        DefaultTableModel model = new DefaultTableModel(
                new String[]{"Nom du Produit", "Prix","Quantité"},
                0
        );
        getView().getProductTable().setModel(model);
        getView().getBackButton().addActionListener(e -> goTo(MenuPresenter.NAME));
        getView().getCreateProduct().addActionListener(e -> goTo(ProductFormPresenter.NAME));
        getView().getEditProduct().addActionListener(e -> goTo(ProductFormPresenter.NAME));

    }

    public static final String NAME = "product-list" ;

    @Override
    public String getPath() {
        return NAME;
    }
}
