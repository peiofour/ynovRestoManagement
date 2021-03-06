package presenter;
;
import utils.RequestHandler;
import view.View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UserListPresenter extends Presenter<UserListPresenter.Displayable> {

        public UserListPresenter(Displayable view) {
            super(view);
        }

        public interface Displayable extends View {
            JTable getUserTable();
            JButton getCreateUser();
            JButton getBackButton();
            JButton getEditUser();
        }

        @Override
        public void execute() {
            DefaultTableModel model = new DefaultTableModel(
                    new String[]{"Nom", "Prénom", "Email","Role"},
                    0
            );
            getView().getUserTable().setModel(model);
            getView().getBackButton().addActionListener(e -> goTo(MenuPresenter.NAME));
            getView().getCreateUser().addActionListener(e -> goTo(UserFormPresenter.NAME));
            getView().getEditUser().addActionListener(e -> goTo(UserFormPresenter.NAME));

            RequestHandler.getInstance().getUsers().forEach(e ->
                model.addRow(new Object[]{
                        e.getLastname(),
                        e.getFirstname(),
                        e.getEmail(),
                        e.getRole()
                }));

        }

        public static final String NAME = "user-list";

        @Override
        public String getPath() {
            return NAME;
        }
}
