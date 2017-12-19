package presenter;

import view.View;

import javax.swing.*;

public class ProductFormPresenter  extends Presenter<ProductFormPresenter.Displayable>{
    public static final String NAME = "product-form";

    public ProductFormPresenter(ProductFormPresenter.Displayable view) {
        super(view);
    }

    @Override
    public String getPath() {
        return NAME;
    }

    public interface Displayable extends View {
        String getPath();
        JButton getBackButton();
        JButton getSubmitButton();
        String getValueForField(String field);
        void reset();
    }

    @Override
    public void execute() {
        getView().getBackButton().addActionListener(e -> goTo(MenuPresenter.NAME));
        getView().getSubmitButton().addActionListener(e -> goTo(ProductListPresenter.NAME));
    }
}
