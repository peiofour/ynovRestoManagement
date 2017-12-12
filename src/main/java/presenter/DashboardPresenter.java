package presenter;

import view.View;

import javax.swing.*;
import java.awt.*;

public class DashboardPresenter extends Presenter<DashboardPresenter.Displayable> {

    public static final String NAME = "dashboard";

    public interface Displayable extends View {
        JButton getDisplayEmployeeListButton();

        JButton getAddEmployeeButton();
    }

    public DashboardPresenter(Displayable view) {
        super(view);
    }

    @Override
    public String getPath() {
        return NAME;
    }

}