package presenter;

import view.View;

import javax.swing.*;

public class ModifyProfilPresenter extends Presenter<ModifyProfilPresenter.Displayable>{
    public static final String NAME = "modify-profil";

    public ModifyProfilPresenter(ModifyProfilPresenter.Displayable view) {
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
        void reset();
    }

    @Override
    public void execute() {
        getView().getBackButton().addActionListener(e -> goTo(MenuPresenter.NAME));
    }
}
